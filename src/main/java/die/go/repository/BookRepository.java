package die.go.repository;

import die.go.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by diego.fernandez on 11/18/15.
 */
public interface BookRepository extends MongoRepository<Book,String> {
}
