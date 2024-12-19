package com.pl.premier_zone.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private  String player_name;
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
        this.player_name = player_name;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMatches_played() {
        return matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public Double getAssists() {
        return assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMatches_played(Integer matches_played) {
        this.matches_played = matches_played;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
