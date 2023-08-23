package day1.day1demo2.repository;

import day1.day1demo2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
  Player findByName(String name);
  Player findByNameLike(String name);
}
