package com.example.players.controllers;

import com.example.players.PlayersApplication;
import com.example.players.dto.PlayerDto;
import com.example.players.models.Player;
import com.example.players.service.PlayerService;
import com.example.players.service.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/")
public class PlayerController {
    private PlayerService playerService;
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("players")
    public ResponseEntity<List<PlayerDto>> getPlayers(){
        return new ResponseEntity<>(playerService.getAllPlayer(), HttpStatus.OK);
    }
    @GetMapping("player/{id}")
    public ResponseEntity<PlayerDto> playerDetail(@PathVariable int id) {
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    @PostMapping("player")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto playerDto){
        return new ResponseEntity<>(playerService.createPlayer(playerDto), HttpStatus.CREATED);
    }
    @PutMapping("player/{id}/update")
    public ResponseEntity<PlayerDto> updatePlayer(@RequestBody PlayerDto playerDto, @PathVariable("id") int playerId){
        PlayerDto response = playerService.updatePlayer(playerDto, playerId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @DeleteMapping("player/{id}/delete")
    public ResponseEntity<String> deletePlayer(@PathVariable("id") int playerId){
        playerService.deletePlayer(playerId);
        return new ResponseEntity<>("Player delete", HttpStatus.OK);
    }
}
