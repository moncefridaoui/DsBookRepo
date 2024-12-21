package org.sid.dsbook.dao.repository;

import org.sid.dsbook.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

        public List<Book> findByTitle(String title);
}
