package org.sid.dsbook.service;

import lombok.AllArgsConstructor;
import org.sid.dsbook.dao.entities.Book;
import org.sid.dsbook.dao.repository.BookRepository;
import org.sid.dsbook.dto.BookDTO;
import org.sid.dsbook.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class BookManager implements BookService {
    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.fromBookDTOToBook(bookDTO);
        book = bookRepository.save(book);
        bookDTO = bookMapper.fromBookTOBookDTO(book);
        return bookDTO;

    }
    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<Book> books = bookRepository.findByTitle(title);
        List<BookDTO> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookTOBookDTO(book));
        }
        return bookDtos;
    }



}
