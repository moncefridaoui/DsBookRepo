package org.sid.dsbook.dto;

import lombok.*;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDTO {
    String resume;
    String publisher;
    String title;
    double price;

}
