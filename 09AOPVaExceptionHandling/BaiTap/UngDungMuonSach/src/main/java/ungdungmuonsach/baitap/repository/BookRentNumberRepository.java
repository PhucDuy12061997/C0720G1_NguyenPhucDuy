package ungdungmuonsach.baitap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ungdungmuonsach.baitap.entity.LibraryCard;

public interface BookRentNumberRepository extends JpaRepository<LibraryCard,Integer> {
}
