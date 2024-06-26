package ch13_classes.ex06.repository;

import ch13_classes.ex06.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private static List<CommentDTO> commentDTOList = new ArrayList<>();
    private static long commentId = 0L;

    public List<CommentDTO> commentCheck(long boardId) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (CommentDTO commentDTO:commentDTOList){
            if(boardId == commentDTO.getBoardId()){
                commentDTOS.add(commentDTO);
            }
        }
        return commentDTOS;
    }
    public boolean commentWrite(CommentDTO commentDTO) {
        commentDTO.setId(++commentId);
        return commentDTOList.add(commentDTO);

    }

}
