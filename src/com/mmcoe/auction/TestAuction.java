package com.mmcoe.auction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestAuction {

    public static void main(String[] args) {

        Auction auction = new Auction();

        try {
            Files.lines(Paths.get("src/Players.txt"))
                    .forEach(line -> {
                        String[] data = line.split(",");
                        Player player = new Player(
                                data[0],
                                data[1],
                                Integer.parseInt(data[2]),
                                data[3]);
                        auction.addPlayer(player);
                    });

            System.out.println("========== TEAMS ==========");
            auction.displayTeams();

            System.out.println("\n========== RCB PLAYERS ==========");
            auction.displayTeamPlayers("RCB");

            System.out.println("\n========== SEARCH PLAYER ==========");
            auction.showPlayerBid("Virat Kohli");

            System.out.println("\n========== BOWLERS ==========");
            auction.displayPlayersByRole("Bowler");
        }
        catch(IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}