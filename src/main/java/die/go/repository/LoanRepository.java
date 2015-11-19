package die.go.repository;

import die.go.domain.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by diego.fernandez on 11/18/15.
 */
public interface LoanRepository extends MongoRepository<Loan,String> {
}
