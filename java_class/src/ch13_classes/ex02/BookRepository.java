package ch13_classes.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRepository {
    private static List<BookDTO> bookDTOList = new ArrayList<>();
    private static long bookId = 1L;
    Scanner scanner = new Scanner(System.in);

    public boolean save(BookDTO bookDTO) {
        bookDTO.setId(bookId++);
        return bookDTOList.add(bookDTO);
    }
    public List<BookDTO> findAll() {
        return bookDTOList;
    }
    public BookDTO findById(long id) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookDTOList.get(i).getId() == id ) {
                bookDTO = bookDTOList.get(i);
            }
        }
        //for each
//        for (BookDTO bookDTO1: bookDTOList){
//            if(id==bookDTO1.getId()){
//                bookDTO= bookDTO1;
//            }
//        }

        return bookDTO;
    }
    public BookDTO findByTitle(String str){
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if(str.equals(bookDTOList.get(i).getBookTitle())) {
                bookDTO = bookDTOList.get(i);
            }

        }
        return bookDTO;
    }
    public boolean update(long id, String bookPrice){
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if(id == bookDTOList.get(i).getId()) {
                bookDTOList.get(i).setBookPrice(bookPrice);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(long id) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if(id == bookDTOList.get(i).getId()){
                bookDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
    public List<BookDTO> search(String q) {
        //검색 결과를 담을 새로운 List 선언
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (int i = 0; i <bookDTOList.size() ; i++) {
            //contains()
            if(bookDTOList.get(i).getBookTitle().contains(q)) {
                bookDTOS.add(bookDTOList.get(i));
            }
        }
        return bookDTOS;
    }
}
