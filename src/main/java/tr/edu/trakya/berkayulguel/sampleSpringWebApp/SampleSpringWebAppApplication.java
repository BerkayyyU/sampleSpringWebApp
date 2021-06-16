package tr.edu.trakya.berkayulguel.sampleSpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Author;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Book;

@SpringBootApplication
public class SampleSpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringWebAppApplication.class, args);

		Author author = new Author();
		author.setFirstName("Ali");
		author.setLastName("Duru");
		author.getFirstName();


		Book book = new Book();
	}

}
