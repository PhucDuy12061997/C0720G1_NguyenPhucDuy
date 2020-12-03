package ungdungmuonsach.baitap.service;

import ungdungmuonsach.baitap.entity.Books;

import java.util.List;
public interface BookService {
    List<Books> findAll();

    Books findById(Integer id);

    void save(Books books);

    String borrow(Integer id) throws Exception;

    String giveBack(Integer rentNumber, Integer id);
}
