package com.example.mongo.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerators;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "users")
@EqualsAndHashCode(of = "id")
public class User {

    @GeneratedValue
    private String id;
    private String name;
    private Adress adress;
}
