package ch10_class.ex08;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        // 필드 직접 접근 불가능
//        book1.bookTitle = "자바";
        // setter 이용하여 필드값 저장
        book1.setBookTitle("나는 읽고 쓰고 버린다");
        // book1 객체의 bookTitle 필드값 출력
        System.out.println(book1.getBookTitle());
        // book1 객체의 bookTitle 필드값을 title 변수에 저장
        String title = book1.getBookTitle();
        System.out.println("title = " + title);
        book1.setBookAuthor("손웅정");
        book1.setBookPrice(17000);

        Book book2 = new Book();
        book2.setBookTitle("불변의 법칙");
        book2.setBookAuthor("모건 하우절");
        book2.setBookPrice(25000);

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}

