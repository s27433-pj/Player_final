package com.example.players.dto;

import com.example.players.annotations.Dictionary;
import lombok.Data;

@Data
public class PlayerDto {
    private int id;
    private String firstName;
    private String lastName;

    @Dictionary("exampleDictionary")
    private String price;
}
