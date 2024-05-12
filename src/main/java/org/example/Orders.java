package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Orders {
    private Long id;
    private Client client;
    private Product product;
    private Double productCount;
}