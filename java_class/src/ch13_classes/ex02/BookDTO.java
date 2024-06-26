package ch13_classes.ex02;

public class BookDTO {
    /**
     * 도서 클래스
     * 필드
     * 도서관리번호(id) - long 타입
     * 도서명(bookTitle)
     * 저자(bookAuthor)
     * 가격(bookPrice)
     * 출판사(bookPublisher)
     * 필드에 대한 getter/setter
     * 생성자 2가지
     * toString method
     */
    private long id = 0;
    private String bookTitle;
    private String bookAuthor;
    private String bookPrice;
    private String bookPublisher;

    public BookDTO() {
    }

    public BookDTO( String bookTitle, String bookAuthor, String bookPrice, String bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
