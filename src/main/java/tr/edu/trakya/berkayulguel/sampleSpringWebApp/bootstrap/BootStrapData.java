package tr.edu.trakya.berkayulguel.sampleSpringWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Author;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Book;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain.Publisher;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories.AuthorRepository;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories.BookRepository;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories.PublisherRepository;


@Component // component olarak command line'da çalışması için işaretlememiz lazım
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric  = new Author("Eric","Evas");
        Book ddd = new Book("Domain Driven Design", "123123");


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Publisher publisher = new Publisher();
        publisher.setName("ABC Yayınevi");
        publisher.setState("Edirne");
        publisherRepository.save(publisher);

        publisher.getBooks().add(ddd);
        ddd.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of publisher: " + publisherRepository.count());
    }
}
