package com.example.playerswagger.service;



import com.example.playerswagger.dto.PlayerDto;

import java.util.List;


public interface PlayerService  {
    PlayerDto createPlayer(PlayerDto playerDto);

    List<PlayerDto> getAllPlayer();

    PlayerDto getPlayerById(int id);

    PlayerDto updatePlayer(PlayerDto playerDto, int id);

    void deletePlayer(int id);
}
