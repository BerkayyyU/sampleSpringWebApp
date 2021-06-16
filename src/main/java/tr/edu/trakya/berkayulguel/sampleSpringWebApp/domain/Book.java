package tr.edu.trakya.berkayulguel.sampleSpringWebApp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = JoinColumn("book_id"),
            inverseJoinColumns = JoinColumn("author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book(){ // Default constructor = Varsayılan halini kullan

    }

    public Book(String title, String isbn, Set<Author> Authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = Authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> Authors) {
        this.authors = Authors;
    }
}
