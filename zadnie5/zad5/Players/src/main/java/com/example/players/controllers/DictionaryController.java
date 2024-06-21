package com.example.players.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryController {

    @GetMapping("/dictionary/{dictionaryName}/{value}")
    public Boolean checkValue(@PathVariable String dictionaryName, @PathVariable String value) {

        return true;
    }
}