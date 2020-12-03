package ungdungmuonsach.baitap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ungdungmuonsach.baitap.entity.Books;
import ungdungmuonsach.baitap.entity.LibraryCard;
import ungdungmuonsach.baitap.repository.BookRentNumberRepository;
import ungdungmuonsach.baitap.repository.BookRepository;
import ungdungmuonsach.baitap.service.BookService;

import java.util.List;

@Service
public class BooksServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookRentNumberRepository bookRentNumberRepository;

    @Override
    public List<Books> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Books books) {
        this.bookRepository.save(books);
    }

    @Override
    public String borrow(Integer id) throws Exception {
            Books books = findById(id);
            if (books.getNumberOfBooks() == 0) {
                throw new Exception("Hết sách này !");
            } else {
                books.setNumberOfBooks(books.getNumberOfBooks() - 1);
                LibraryCard libraryCard = new LibraryCard();
                libraryCard.setIdCard((int) (Math.random() * 100));
                libraryCard.setRentNumber((int) ((Math.random() * 99999) + 10000));
                this.bookRentNumberRepository.save(libraryCard);
                return String.valueOf(libraryCard.getRentNumber()) ;
            }

    }

    @Override
    public String giveBack(Integer rentNumber, Integer id) {
        List<LibraryCard> libraryCardList = this.bookRentNumberRepository.findAll();
        boolean check = false;
        for (LibraryCard libraryCard : libraryCardList) {
            if (libraryCard.getRentNumber().equals(rentNumber)) {
                check = true;
                Books books = findById(id);
                books.setNumberOfBooks(books.getNumberOfBooks() + 1);
                this.bookRentNumberRepository.delete(libraryCard);
                break;
            }
        }
        if (check) {
            return "Give Back complete !";
        } else {
            return "Book rent Number is not exist !";
        }
    }
}
