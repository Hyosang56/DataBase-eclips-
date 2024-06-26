package ch13_classes.ex02;

import ch13_classes.ex01.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class BookService {
    private BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);


    public void save() {
        System.out.print("도서명 입력: ");
        String str1 = scanner.next();
        System.out.print("저자 입력: ");
        String str2 = scanner.next();
        System.out.print("가격 입력: ");
        String str3 = scanner.next();
        System.out.print("출판사 입력: ");
        String str4 = scanner.next();
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookTitle(str1);
        bookDTO.setBookAuthor(str2);
        bookDTO.setBookPrice(str3);
        bookDTO.setBookPublisher(str4);
//        BookDTO bookDTO = new BookDTO(str1, str2, str3, str4);
        boolean result = bookRepository.save(bookDTO);
        if(result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }
    public void findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO: bookDTOList) {
            System.out.println("도서 목록 = " + bookDTO);
        }
    }
    public void findById() {
        System.out.print("조회할 id 입력: ");
        long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null) {
            System.out.println("조회하신 도서는 = " + bookDTO);
        } else {
            System.out.println("조회 결과가 없습니다.");
        }
    }

    public void findByTitle() {
        System.out.print("조회할 도서 제목 입력: ");
        String str1 = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(str1);

        if(bookDTO != null) {
            System.out.println("조회하신 도서는 = " + bookDTO);
        } else {
            System.out.println("조회 결과가 없습니다.");
        }
    }
    public void update() {
        //수정할 책의 id를 입력받음
        //책이 있다면 수정할 가격을 입력받고 수정처리
        // => 책 조회가 안된다면 없다고 출력
        System.out.print("가격 수정할 책의 ID 입력: ");
        long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("수정할 가격: ");
            String bookPrice = scanner.next();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else{
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("조괴 결과가 없습니다.");
        }


    }
    public void delete() {
        System.out.println("삭제할 도서의 ID 입력: ");
        long id = scanner.nextLong();
       boolean result = bookRepository.delete(id);
       if (result) {
           System.out.println("삭제 성공");
       } else {
           System.out.println("삭제 실패");
       }

    }
    public void search() {
        System.out.print("검색할 도서 입력: ");
        String q = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(q);
        if (bookDTOList.size()>0) {
            for (BookDTO bookDTO:bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {

            System.out.println("검색 결과가 없습니다.");
        }
    }

}
