package org.sid.dsbook.dao.entities;

import jakarta.persistence.Id;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Book {
    @Id
    @GeneratedValue
    Long id_Book ;
    String title ;
    String publisher ;
    Date datePublication ;
    double price;
    String resume ;
}
