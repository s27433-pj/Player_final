package com.example.players.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    @jakarta.persistence.Id
    private int id;
    private String firstName;
    private String lastName;

}
