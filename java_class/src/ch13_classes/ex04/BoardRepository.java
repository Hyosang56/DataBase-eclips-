package ch13_classes.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();
    private static long Id = 1L;
    Scanner scanner = new Scanner(System.in);

    public boolean write(BoardDTO boardDTO) {
        boardDTO.setBoardId(Id++);
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public BoardDTO findWriting(long id) {
        BoardDTO boardDTO = new BoardDTO();
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if(id == boardDTOList.get(i).getBoardId()) {
                long view = boardDTOList.get(i).getBoardViews();
                view +=1;
                boardDTOList.get(i).setBoardViews(view);
                boardDTO.setBoardContents(boardDTOList.get(i).getBoardContents());
                boardDTO.setBoardViews(boardDTOList.get(i).getBoardViews());
                boardDTO.setBoardId(boardDTOList.get(i).getBoardId());
            }
        }
        return boardDTO;
    }
    public boolean update(long id, String password) {
        boolean result = false;
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if(id == boardDTOList.get(i).getBoardId() && password.equals(boardDTOList.get(i).getBoardPassword())) {
                System.out.print("수정할 제목 입력: ");
                String title = scanner.next();
                System.out.print("수정할 내용 입력: ");
                String content = scanner.next();
                boardDTOList.get(i).setBoardTitle(title);
                boardDTOList.get(i).setBoardContents(content);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(long id, String password) {
        boolean result = false;
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if(id == boardDTOList.get(i).getBoardId() && password.equals(boardDTOList.get(i).getBoardPassword())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
    public List<BoardDTO> search(String title) {
        List<BoardDTO>boardDTOS = new ArrayList<>();
        for (int i = 0; i <boardDTOList.size() ; i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(title)){
                boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }
}
