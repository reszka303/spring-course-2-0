package pl.javastart.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/api/books")
public class BookController {

//    @GetMapping("/api/books")
//    @ResponseBody
    @GetMapping
    List<Book> getBooks() {
        return List.of(
                new Book("Harry Potter", "J.K. Rowling", 1997, 223),
                new Book("Cień wiatru", "Carlos Ruiz Zafon", 2001, 565),
                new Book("Latarnik", "Henryk Sienkiewicz", 1881, 24)
        );
    }

//    @GetMapping("/api/books/1")
//    @ResponseBody
    @GetMapping("/1")
    Book getSingleBook() {
        return new Book("Harry Potter", "J.K. Rowling", 1997, 223);
    }
}
