package ch10_class.ex08;

public class Book {
    // 필드
    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;

    // bookTitle setter
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // bookTitle getter
    public String getBookTitle() {
        return bookTitle;
    }

    // bookAuthor setter
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // bookAuthor getter
    public String getBookAuthor() {
        return bookAuthor;
    }

    // bookPrice setter
    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    // bookPrice getter
    public int getBookPrice() {
        return bookPrice;
    }

    // toString 메서드
    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}


