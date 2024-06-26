package ch13_classes.ex04;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void write() {
        System.out.print("제목을 입력: ");
        String boardTitle = scanner.next();
        System.out.print("작성자를 입력: ");
        String boardWrite = scanner.next();
        System.out.print("내용을 입력: ");
        String boardContents = scanner.next();
        System.out.print("비밀번호를 입력: ");
        String boardPassword = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle,boardWrite,boardContents,boardPassword);
        boolean result = boardRepository.write(boardDTO);
        if (result) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }
    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);    //클래스 내부에서 사용하는거라 .listPrint 형태로 안만들어도 된다.

    }
    public void findWriting() {
        System.out.print("조회할 글번호 입력: ");
        long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findWriting(id);
        System.out.println("조회한 글 번호: " + boardDTO.getBoardId() +"\t조회한 내용: "+boardDTO.getBoardContents()+
                "\t조회수: "+boardDTO.getBoardViews());
    }

    public void update() {
        System.out.print("수정할 글번호 출력: ");
        long id = scanner.nextLong();
        System.out.print("비밀번호 입력: ");
        String password = scanner.next();
        boolean result = boardRepository.update(id,password);
        if(result){
            System.out.println("수정되었습니다.");
        } else {
            System.out.println("비밀번호를 틀렸습니다.");
        }
    }
    public void delete() {
        System.out.print("삭제할 글번호 출력: ");
        long id = scanner.nextLong();
        System.out.print("비밀번호 입력: ");
        String password = scanner.next();
        boolean result = boardRepository.delete(id,password);
        if(result){
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("비밀번호를 틀렸습니다.");
        }
    }
    public void search() {
        System.out.print("검색할 제목 입력: ");
        String title = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(title);
        if(boardDTOList.size()>0) {
            listPrint(boardDTOList);
        } else {
            System.out.println("검색결과가 없습니다.");
        }
    }
    public void testData() {
        for (int i = 1; i < 11 ; i++) {
            BoardDTO boardDTO = new BoardDTO("title" +i, "writer"+i,"contents","1234" );
            boardRepository.write(boardDTO);
        }
    }
    // 목록 출력 전용 메서드
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t"+"datd\t");
        for(BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO.getBoardId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardViews() + "\t" +
                    boardDTO.getCreatedAt());
        }

    }
}
