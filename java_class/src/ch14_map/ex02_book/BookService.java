package ch14_map.ex02_book;

import ch13_classes.ex02.BookDTO;

import java.util.Map;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

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
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (long k: bookDTOMap.keySet()){
            System.out.println(bookDTOMap.get(k));
            //제목만 출력한다면
            System.out.println(bookDTOMap.get(k).getBookTitle());
        }
    }
    public void findById() {
        System.out.print("조회할 ID입력: ");
        long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO !=null){
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다.");
        }

    }
    public void findByTitle() {
        System.out.println("조회할 제목: ");
        String title = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(title);
        if(bookDTO !=null){
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다.");
        }
    }
}
