package org.sid.dsbook;

import org.sid.dsbook.dto.BookDTO;
import org.sid.dsbook.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsBookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookService bookService){
        return  args -> {
            bookService.saveBook(
                    (BookDTO) List.of(
                            BookDTO.builder().title("livre1").publisher("xxx").resume("hbehbcz").price(12345).build(),
                            BookDTO.builder().title("livre2").publisher("yyyy").resume("zhbhjdz").price(65489).build(),
                            BookDTO.builder().title("livre3").publisher("zzzzz").resume("hjazhjehjv").price(89789).build(),
                            BookDTO.builder().title("livre4").publisher("mmmmm").resume("gvdgdgdvghdv").price(67489).build()
                    )

            );
        };
    }

}
