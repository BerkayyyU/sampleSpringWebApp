package tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
