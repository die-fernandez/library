package die.go.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

/**
 * Created by diego.fernandez on 11/18/15.
 */

public class Loan {

    @Id
    private String id;
    @DBRef
    private Book book;
    private String userMail;
    private LocalDateTime loanTime;


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public LocalDateTime getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(LocalDateTime loanTime) {
        this.loanTime = loanTime;
    }
}
