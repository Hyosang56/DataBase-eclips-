package ch13_classes.ex07.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO {

    private long id = 0L;
    private long boardId;
    private String commentWriter;
    private String commentContents;
    private String createdAt;

    public CommentDTO() {
    }
    public CommentDTO( long boardId, String commentWriter, String commentContents) {
        this.boardId = boardId;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getBoardId() {
        return boardId;
    }
    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }
    public String getCommentWriter() {
        return commentWriter;
    }
    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }
    public String getCommentContents() {
        return commentContents;
    }
    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
