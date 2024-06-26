package ch13_classes.ex07.repository;

import ch13_classes.ex07.dto.BoardDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
    private static Map<Long,BoardDTO> boardDTOMap = new HashMap<>();
    private static long boardId = 0L;
    public static long boardKey = 1L;

    public boolean write(BoardDTO boardDTO) {
        boardDTO.setId(++boardId);
        BoardDTO boardDTO1 = boardDTOMap.put(boardKey++,boardDTO);
        if(boardDTO1 != null){
            return true;
        } else {
            return false;
        }
    }

    public Map<Long,BoardDTO> findAll() {
        return boardDTOMap;
    }
    public BoardDTO findWriting(long boardId) {
        BoardDTO boardDTO = new BoardDTO();
        for (Long k: boardDTOMap.keySet()){
            if (boardId == boardDTOMap.get(k).getId()) {
                long hits = boardDTOMap.get(k).getBoardHits();
                hits += 1;
                boardDTO.setBoardHits(hits);
                return boardDTO;
            }
        }
        return null;
    }

    public boolean loginCheck(long boardId, String loginEmail) {
        boolean result = false;
        for (Long k: boardDTOMap.keySet()){
            if(boardId == boardDTOMap.get(k).getId() && loginEmail.equals(boardDTOMap.get(k).getBoardWriter())){
                result = true;
            }
        }
        return result;
    }
    public boolean update(String title, String contents , long boardId) {
        boolean result = false;
        for (Long k: boardDTOMap.keySet()){
            if(boardId == boardDTOMap.get(k).getId()){
                boardDTOMap.get(k).setBoardTitle(title);
                boardDTOMap.get(k).setBoardContents(contents);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(long boardId) {
        boolean result = false;
        for (Long k: boardDTOMap.keySet()) {
            if(boardId == boardDTOMap.get(k).getId()){
                boardDTOMap.remove(k);
                result = true;
            }
        }
        return result;
    }
    public Map<Long,BoardDTO> search(String question) {
        Map<Long,BoardDTO>boardDTOS = new HashMap<>();
        long boardKey = 1L;
        for (Long k: boardDTOMap.keySet()){
            if(boardDTOMap.get(k).getBoardTitle().contains(question)){
                boardDTOS.put(boardKey++,boardDTOMap.get(k));
            }
        }
        return boardDTOS;
    }
}
