package com.pl.premier_zone.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {
    // lets create a field to create playerService
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team_name,
            @RequestParam(required = false) String playerName,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String nation
    ){
        if (team_name != null && position != null ){
            return playerService.getPlayerByTeamAndPosition(team_name, position);
        } else if (team_name != null) {
            return playerService.getPlayersFromTeam(team_name);
        } else if (playerName != null) {
            return playerService.getPlayersByName(playerName);
        } else if (position != null) {
            return  playerService.getPlayersByPosition(position);
        } else if (nation != null) {
            return playerService.getPlayersByNation(nation);
        }else {
            return playerService.getPlayers();
        }
    }
}
