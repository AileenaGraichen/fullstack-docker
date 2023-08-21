package day1.day1demo2.config;

import day1.day1demo2.entity.Player;
import day1.day1demo2.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataSetup implements ApplicationRunner {
    PlayerRepository playerRepository;
    public DataSetup(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Cristiano Ronaldo", "Portugal", "Forward"));
        players.add(new Player("Lionel Messi", "Argentina", "Forward"));
        players.add(new Player("Antoine Griezmann", "France", "Forward"));
        players.add(new Player("Mohamed Salah", "Egypt", "Forward"));
        players.add(new Player("Neymar", "Brazil", "Forward"));
        players.add(new Player("Kevin de Bruyne", "Belgium", "Midfielder"));
        players.add(new Player("Luis Suarez", "Uruguay", "Forward"));
        players.add(new Player("Robert Lewandowski", "Poland", "Forward"));
        players.add(new Player("David de Gea", "Spain", "Goalkeeper"));
        players.add(new Player("Harry Kane", "England", "Forward"));
        players.add(new Player("Eden Hazard", "Belgium", "Forward"));
        players.add(new Player("Kylian Mbappe", "France", "Forward"));
        players.add(new Player("Sergio Ramos", "Spain", "Defender"));
        players.add(new Player("Toni Kroos", "Germany", "Midfielder"));
        players.add(new Player("Luka Modric", "Croatia", "Midfielder"));
        players.add(new Player("Paul Pogba", "France", "Midfielder"));
        players.add(new Player("N'Golo Kante", "France", "Midfielder"));
        players.add(new Player("Manuel Neuer", "Germany", "Goalkeeper"));
        players.add(new Player("Sergio Aguero", "Argentina", "Forward"));
        players.add(new Player("Romelu Lukaku", "Belgium", "Forward"));
        players.add(new Player("Philippe Coutinho", "Brazil", "Midfielder"));
        players.add(new Player("James Rodriguez", "Colombia", "Midfielder"));
        players.add(new Player("Isco", "Spain", "Midfielder"));
        players.add(new Player("Marcelo", "Brazil", "Defender"));
        players.add(new Player("Thibaut Courtois","Belgium","Goalkeeper"));
        playerRepository.saveAll(players);


    }


}

