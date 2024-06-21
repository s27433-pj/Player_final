package com.example.players.service;

import com.example.players.dto.PlayerDto;

import java.util.List;


public interface PlayerService  {
    PlayerDto createPlayer(PlayerDto playerDto);

    List<PlayerDto> getAllPlayer();

    PlayerDto getPlayerById(int id);

    PlayerDto updatePlayer(PlayerDto playerDto, int id);

    void deletePlayer(int id);
}
