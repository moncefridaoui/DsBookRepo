package org.sid.dsbook.web;

import org.sid.dsbook.dto.BookDTO;
import org.sid.dsbook.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;


public class BookGraphQLControler {
    private BookService bookService ;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }
    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }

}
