package ungdungmuonsach.baitap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ungdungmuonsach.baitap.entity.Books;

public interface BookRepository extends JpaRepository<Books,Integer> {
}
