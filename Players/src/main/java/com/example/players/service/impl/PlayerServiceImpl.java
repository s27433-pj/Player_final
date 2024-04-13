package com.example.players.service.impl;

import com.example.players.dto.PlayerDto;
import com.example.players.models.Player;
import com.example.players.repository.PlayerRepository;
import com.example.players.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getFirstName());

        Player newPlayer = playerRepository.save(player);

        PlayerDto playerResponse = new PlayerDto();
        playerResponse.setId(newPlayer.getId());
        playerResponse.setFirstName(newPlayer.getFirstName());
        playerResponse.setLastName(newPlayer.getLastName());

        return playerResponse;
    }

    @Override
    public List<PlayerDto> getAllPlayer() {
        List<Player> players = playerRepository.findAll();
        return players.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public PlayerDto getPlayerById(int id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Player not found with id: " + id));
        return mapToDto(player);
    }

    @Override
    public PlayerDto updatePlayer(PlayerDto playerDto, int id) {
        Player player = playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player could not be updated: " + id));

        player.setLastName(playerDto.getLastName());
        player.setFirstName(playerDto.getFirstName());

        Player updatedPlayer = playerRepository.save(player);
        return mapToDto(updatedPlayer);
    }

    @Override
    public void deletePlayer(int id) {
        Player player = playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player could not be deleted: " + id));
        playerRepository.delete(player);
    }


    private PlayerDto mapToDto(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId(player.getId());
        playerDto.setFirstName(player.getFirstName());
        playerDto.setLastName(player.getLastName());
        return playerDto;
    }

    private Player mapToEntity(PlayerDto playerDto) {
        Player player = new Player();
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getLastName());
        return player;
    }


}
