package com.mmcoe.auction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestAuctionJdbc {

    public static void main(String[] args) {

        Auction auction = new Auction();

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM player");

            while (rs.next()) {

                Player player = new Player(
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getInt("bid"),
                        rs.getString("team_name"));

                auction.addPlayer(player);
            }

            rs.close();
            st.close();
            con.close();

            System.out.println("========== TEAMS ==========");
            auction.displayTeams();

            System.out.println("\n========== RCB PLAYERS ==========");
            auction.displayTeamPlayers("RCB");

            System.out.println("\n========== SEARCH PLAYER ==========");
            auction.showPlayerBid("Virat Kohli");

            System.out.println("\n========== BOWLERS ==========");
            auction.displayPlayersByRole("Bowler");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}