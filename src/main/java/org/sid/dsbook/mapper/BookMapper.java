package org.sid.dsbook.mapper;

import org.modelmapper.ModelMapper;
import org.sid.dsbook.dao.entities.Book;
import org.sid.dsbook.dto.BookDTO;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDTOToBook(BookDTO bookDTO){
        return mapper.map(bookDTO, Book.class);
    }

    public BookDTO fromBookTOBookDTO(Book book){
        return mapper.map(book, BookDTO.class);
    }

}