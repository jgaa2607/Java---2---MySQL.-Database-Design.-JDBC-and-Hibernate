package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private Long id;
    private String productName;
    private String description;
    private Double price;
    private Category category;
}
