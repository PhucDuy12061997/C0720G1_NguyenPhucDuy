package ungdungmuonsach.baitap.service;

import org.springframework.stereotype.Service;
import ungdungmuonsach.baitap.entity.Books;

import java.util.List;
public interface BookService {
    List<Books> findAll();

    Books findById(Integer id);

    void save(Books books);

    void borrow(Integer id) throws Exception;

    String giveBack(Integer rentNumber, Integer id);
}
