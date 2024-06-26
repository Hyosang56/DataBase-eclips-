package ch13_classes.ex06.service;

import ch13_classes.ex06.dto.BoardDTO;
import ch13_classes.ex06.dto.CommentDTO;
import ch13_classes.ex06.repository.BoardRepository;
import ch13_classes.ex06.repository.CommentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();

    public void write(String loginEmail) {
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("내용: ");
        String contents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(title,loginEmail,contents);
        boolean result = boardRepository.write(boardDTO);
        if(result){
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }
    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        System.out.println("id\t title\t writer\t hits\t date\t");
        for (BoardDTO boardDTO:boardDTOList){
            System.out.println(boardDTO.getId()+"\t "+boardDTO.getBoardTitle()+"\t "+boardDTO.getBoardWriter()+"\t "+boardDTO.getBoardHits()+"\t "+boardDTO.getCreatedAt());
        }
    }
    public void findWriting(String loginEmail) {
        System.out.print("조회할 ID: ");
        long boardId = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findWriting(boardId);
        if (boardDTO != null){
            System.out.println("boardDTO = " + boardDTO);
        } else {
            System.out.println("없는 ID입니다.");
        }
        System.out.println("===== 댓글 =====");
        List<CommentDTO> commentDTOList = commentRepository.commentCheck(boardId);
        if(commentDTOList.size()>0 ){
            for (CommentDTO commentDTO: commentDTOList){
                System.out.println("commentDTO = " + commentDTO);
            }
        } else {
            System.out.println("작성된 댓글이 없습니다.");
        }
        System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
        System.out.println("메인메뉴로 돌아가시려면 2번을 입력해주세요.");
        System.out.print("입력: ");
        int selectNo = scanner.nextInt();
        if (selectNo == 1){
            System.out.print("댓글 내용: ");
            String contents = scanner.next();
            CommentDTO commentDTO2 = new CommentDTO(boardId,loginEmail,contents);
            boolean result = commentRepository.commentWrite(commentDTO2);
            if(result){
                System.out.println("댓글작성 완료");
            } else {
                System.out.println("댓글작성 실패");
            }
        } else if (selectNo == 2) {
            System.out.println("글조회가 종료되고 메인메뉴로 돌아왔습니다.");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
    public void update(String loginEmail) {
        System.out.print("수정할 ID: ");
        long boardId = scanner.nextLong();
        boolean result = boardRepository.loginCheck(boardId,loginEmail);
        if(result){
            System.out.print("수정할 제목: ");
            String title = scanner.next();
            System.out.print("수정할 내용: ");
            String contents = scanner.next();
            boolean result2 = boardRepository.update(title,contents,boardId);
            if(result2){
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("본인이 작성한 글만 수정가능합니다.");
        }
    }
    public void delete(String loginEmail) {
        System.out.print("삭제할 ID: ");
        long boardId = scanner.nextLong();
        boolean result = boardRepository.loginCheck(boardId,loginEmail);
        if(result){
            boolean result2 = boardRepository.delete(boardId);
            if(result2){
                System.out.println("삭제 완료");
            } else {
                System.out.println("삭제 실패");
            }
        } else {
            System.out.println("본인이 작성한 글만 삭제가능합니다.");
        }
    }
    public void search() {
        System.out.print("제목 검색: ");
        String question = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(question);
        for (BoardDTO boardDTO: boardDTOList){
            System.out.println("boardDTO = " + boardDTO);
        }
    }
    public void sample(String loginEmail) {
        for (int i = 1; i < 11; i++) {
            BoardDTO boardDTO = new BoardDTO("제목"+i,loginEmail,"내용"+i);
            boardRepository.write(boardDTO);
        }
        System.out.println("샘플이 생성되었습니다.");
    }
}
