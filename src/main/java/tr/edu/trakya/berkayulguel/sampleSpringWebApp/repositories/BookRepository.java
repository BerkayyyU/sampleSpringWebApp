package tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
