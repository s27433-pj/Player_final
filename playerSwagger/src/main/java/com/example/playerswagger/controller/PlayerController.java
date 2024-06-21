package com.example.playerswagger.controller;

import org.openapitools.api.ApiApi;


import org.openapitools.model.PlayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController implements ApiApi {

    @Autowired
    private com.example.playerswagger.service.PlayerService playerService;

    public ResponseEntity<List<com.example.playerswagger.dto.PlayerDto>> getAllPlayers() {
        return ResponseEntity.ok(playerService.getAllPlayer());
    }

    public ResponseEntity<com.example.playerswagger.dto.PlayerDto> getPlayerById(Integer id) {
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    public ResponseEntity<com.example.playerswagger.dto.PlayerDto> updatePlayerById(com.example.playerswagger.dto.PlayerDto id, PlayerDto playerDto) {
        return ResponseEntity.ok(playerService.updatePlayer(id, playerDto.getId()));
    }

    public ResponseEntity<Void> deletePlayerById(Integer id) {
        playerService.deletePlayer(id);
        return ResponseEntity.ok().build();
    }

}
