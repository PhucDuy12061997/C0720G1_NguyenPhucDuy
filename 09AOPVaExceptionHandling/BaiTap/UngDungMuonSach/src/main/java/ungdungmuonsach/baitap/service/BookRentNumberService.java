package ungdungmuonsach.baitap.service;

import ungdungmuonsach.baitap.entity.LibraryCard;

import java.util.List;

public interface BookRentNumberService {
    List<LibraryCard> findAll();
    void  save(LibraryCard libraryCard);
}
