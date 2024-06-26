package ch13_classes.ex06.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    private long id = 0L;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private long boardHits= 0L;
    private String createdAt;

    public BoardDTO() {
    }
    public BoardDTO(String boardTitle, String boardWriter, String boardContents) {
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBoardTitle() {
        return boardTitle;
    }
    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }
    public String getBoardWriter() {
        return boardWriter;
    }
    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }
    public String getBoardContents() {
        return boardContents;
    }
    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }
    public long getBoardHits() {
        return boardHits;
    }
    public void setBoardHits(long boardHits) {
        this.boardHits = boardHits;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits='" + boardHits + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
