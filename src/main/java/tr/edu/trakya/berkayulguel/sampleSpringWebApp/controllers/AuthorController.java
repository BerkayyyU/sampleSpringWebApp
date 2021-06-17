package tr.edu.trakya.berkayulguel.sampleSpringWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.edu.trakya.berkayulguel.sampleSpringWebApp.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        System.out.println((authorRepository.count()));
        model.addAttribute("authors",authorRepository.findAll());
        return "books/authorlist";
    }
}
 