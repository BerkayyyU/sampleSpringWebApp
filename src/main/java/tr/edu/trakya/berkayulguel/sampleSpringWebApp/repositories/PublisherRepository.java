package tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
