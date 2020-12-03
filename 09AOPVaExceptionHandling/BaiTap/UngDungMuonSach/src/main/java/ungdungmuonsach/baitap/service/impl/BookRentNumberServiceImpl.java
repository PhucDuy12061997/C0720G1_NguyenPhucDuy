package ungdungmuonsach.baitap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ungdungmuonsach.baitap.entity.LibraryCard;
import ungdungmuonsach.baitap.repository.BookRentNumberRepository;
import ungdungmuonsach.baitap.service.BookRentNumberService;

import java.util.List;
@Service
public class BookRentNumberServiceImpl implements BookRentNumberService {
    @Autowired
    private BookRentNumberRepository bookRentNumberRepository;
    @Override
    public List<LibraryCard> findAll() {
        return this.bookRentNumberRepository.findAll();
    }

    @Override
    public void save(LibraryCard libraryCard) {
this.bookRentNumberRepository.save(libraryCard);
    }
}
