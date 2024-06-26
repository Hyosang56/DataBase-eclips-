package ch10_class.ex05;

public class Book {
    /**
     * 제목(bookTitle), 저자(bookAuthor), 출판사(bookPublisher)
     * 출시일(bookDate), 가격(bookPrice)
     */

    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    String bookDate;
    int bookPrice;

    //기본생성자
    public Book() {
    }

    public Book(String bookTitle, String bookAuthor, String bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
    }

    // 제목, 저자를 매개변수로하는 생성자
    // (매개변수 값을 필드에 담음)
    public Book(String bookTitle,String bookAuthor ){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    //모든 필드를 매개변수로 하는 생성자
    // (매개변수 값을 필드에 담음)
    public Book(String bookTitle,
    String bookAuthor,
    String bookPublisher,
    String bookDate,
    int bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookDate = bookDate;
        this.bookPrice = bookPrice;
    }


}
