package org.sid.dsbook.service;


import org.sid.dsbook.dto.BookDTO;

import java.util.List;

public interface BookService {
    public BookDTO saveBook(BookDTO bookDTO);


    public List<BookDTO> getBookByTitle(String title);
}
