package ch10_class.ex05;

public class BookMain {
    public static void main(String[] args) {
        // 기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "불변의 법칙";
        book1.bookAuthor = "모건 하우절";
        book1.bookPublisher = "서감독";
        book1.bookDate = "2024.02.28";
        book1.bookPrice = 22500;

        //매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("일류의조건",
                "사이토 다카시");

        //모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("나를 소모하지 않는 현명한 태도의 관하여",
                "마티아스 뉠케",
                "퍼스트팽귄",
                "2024.03.10",
                16020);
        System.out.println(book1.bookTitle);
        System.out.println(book2.bookTitle);
        System.out.println(book3.bookTitle);

    }

}
