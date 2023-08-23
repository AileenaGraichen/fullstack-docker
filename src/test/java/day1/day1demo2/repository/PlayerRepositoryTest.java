package day1.day1demo2.repository;

import day1.day1demo2.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class PlayerRepositoryTest {

  @Autowired
  PlayerRepository playerRepository;

  private boolean dataInitialized = false;
  @BeforeEach
  void setUp() {
    if(!dataInitialized) {
      playerRepository.deleteAll();
      playerRepository.save(new Player("Lionel Messi","C1","P1"));
      playerRepository.save(new Player("P2","C2","P2"));
      dataInitialized = true;
    }
  }

  @Test
  void testPlayerRepository() {
    assertEquals(2, playerRepository.count(),"Expects two player rows in the database");
  }

  @Test
  void testSaveMethod() {
    Player player = playerRepository.save(new Player("P3","C3","P3"));
    assertTrue(player.getId()>0,"Expects the player to be saved and get an id");
  }

  @Test
  void findByName() {
    Player player = playerRepository.findByName("P2");
    assertEquals("P2", player.getName());
  }

  @Test
  void findByNameLike() {
    Player player = playerRepository.findByNameLike("%Messi%");
    assertEquals("Lionel Messi", player.getName());
  }

}