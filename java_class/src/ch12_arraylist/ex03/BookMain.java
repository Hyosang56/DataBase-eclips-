package ch12_arraylist.ex03;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        /**
         * Book 객체를 담기위한 bookList
         * 기본생성자로 Book 객체 생성 후 bookList에 추가
         * 매개변수 있는 생정자로 Book 객체 생성 후 bookList에 추가
         * for문을 이용하여 책 전체정보, 책제목 출력
         * for each 문을 이용하여 책 전체정보, 저자 출력
         */

        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setBookTitle("나는 읽고 쓰고 버린다");
        book1.setBookAuthor("손웅정");
        book1.setBookPrice(15300);
        book1.setBookPublisher("난다");
        bookList.add(book1);

        Book book2 = new Book(2,"불변의법칙","모건 하우절",22500,"서삼독");
        bookList.add(book2);

        for (int i = 0; i < bookList.size() ; i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
            System.out.println("bookList.get(i).bookTitle = " + bookList.get(i).bookTitle);
        }
        for (Book book:bookList) {
            System.out.println("book = " + book);
            System.out.println("book.bookAuthor = " + book.bookAuthor);
        }
        //0번 인덱스에 담긴 책의 가격을 50000으로 수정
        bookList.get(0).setBookPrice(50000);
        //1번 인덱스에 담긴 출판사 이름을 "안녕출판사"로 수정
        bookList.get(1).setBookPublisher("안녕출판사");
        for(Book book: bookList) {
            System.out.println("book = " + book);
        }

    }
}
