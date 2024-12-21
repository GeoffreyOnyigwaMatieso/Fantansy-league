package com.pl.premier_zone.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "playerName", unique = true)
    private  String playerName;
    private String nation;
    private String position;
    private  Integer age;
    private  Integer matches_played;
    private  Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private  Double penalties_scored;
    private Double yellow_cards;
    private  Double red_cards;
    private  Double expected_goals;
    private String team_name;

    public Player(String player_name) {
        this.playerName = playerName;
    }

}
