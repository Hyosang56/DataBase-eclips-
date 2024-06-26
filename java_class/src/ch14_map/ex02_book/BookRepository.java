package ch14_map.ex02_book;

import ch13_classes.ex02.BookDTO;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private static Map<Long,BookDTO> bookDTOMap = new HashMap<>();
    private static long bookId = 1L;

    public boolean save(BookDTO bookDTO) {
        bookDTO.setId(bookId++);
        BookDTO dto = bookDTOMap.put(bookDTO.getId(),bookDTO);
        if(dto == null){
            return true;
        } else {
            return false;
        }
    }
    public Map<Long, BookDTO> findAll() {
        return bookDTOMap;
    }

    public BookDTO findById(long id) {
        BookDTO bookDTO = null;
        for (Long k:bookDTOMap.keySet()){
            if (id == bookDTOMap.get(k).getId()){
                bookDTO=bookDTOMap.get(k);
            }
        }
        return bookDTO;
    }

    public BookDTO findByTitle(String title) {
        BookDTO bookDTO = null;
        for (Long k : bookDTOMap.keySet()){
            if(title.equals(bookDTOMap.get(k).getBookTitle())){
                bookDTO = bookDTOMap.get(k);
            }
        }
        return bookDTO;
    }
}
