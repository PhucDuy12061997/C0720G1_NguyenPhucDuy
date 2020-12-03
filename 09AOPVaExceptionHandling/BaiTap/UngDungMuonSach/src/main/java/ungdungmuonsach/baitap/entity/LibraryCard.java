package ungdungmuonsach.baitap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "libraryCard")
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCard;
    private Integer rentNumber;

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public Integer getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(Integer rentNumber) {
        this.rentNumber = rentNumber;
    }

    public LibraryCard() {
    }
}
