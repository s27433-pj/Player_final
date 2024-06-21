package com.example.players.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dictionaryClient", url = "http://localhost:8080")
public interface DictionaryClient {

    @GetMapping("/dictionary/{dictionaryName}/{value}")
    Boolean checkValue(@PathVariable("dictionaryName") String dictionaryName, @PathVariable("value") String value);
}