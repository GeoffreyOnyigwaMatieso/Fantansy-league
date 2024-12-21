package com.pl.premier_zone.player;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String player_name);
    Optional<Player> findByPlayerName(String player_name);
}
