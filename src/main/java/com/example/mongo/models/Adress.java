package com.example.mongo.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "adress")
@EqualsAndHashCode(of = "id")
public class Adress {
    private String id;
    private String country;
    private String ctiy;
}
