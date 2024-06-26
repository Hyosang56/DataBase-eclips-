package ch13_classes.ex06.repository;

import ch13_classes.ex06.dto.BoardDTO;
import ch13_classes.ex06.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();
    private static long boardId = 0L;

    public boolean write(BoardDTO boardDTO) {
        boardDTO.setId(++boardId);
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }
    public BoardDTO findWriting(long boardId) {
        for (BoardDTO boardDTO : boardDTOList){
            if (boardId == boardDTO.getId()) {
                long hits = boardDTO.getBoardHits();
                hits += 1;
                boardDTO.setBoardHits(hits);
                return boardDTO;
            }
        }
        return null;
    }

    public boolean loginCheck(long boardId, String loginEmail) {
        boolean result = false;
        for (BoardDTO boardDTO:boardDTOList){
            if(boardId == boardDTO.getId() && loginEmail.equals(boardDTO.getBoardWriter())){
                result = true;
            }
        }
        return result;
    }
    public boolean update(String title, String contents , long boardId) {
        boolean result = false;
        for (BoardDTO boardDTO: boardDTOList){
            if(boardId == boardDTO.getId()){
                boardDTO.setBoardTitle(title);
                boardDTO.setBoardContents(contents);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(long boardId) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if(boardId == boardDTOList.get(i).getId()){
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
    public List<BoardDTO> search(String question) {
        List<BoardDTO> boardDTOS =new ArrayList<>();
        for (BoardDTO boardDTO: boardDTOList){
            if(boardDTO.getBoardTitle().contains(question)){
                boardDTOS.add(boardDTO);
            }
        }
        return boardDTOS;
    }
}
