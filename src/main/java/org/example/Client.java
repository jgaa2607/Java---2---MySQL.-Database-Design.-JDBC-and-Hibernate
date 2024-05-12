package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Client {
    private Long id;
    private String clientName;
    private String address;
    private String phoneNumber;
}