package com.mmcoe.auction;

import java.util.LinkedList;

public class Auction {

    private LinkedList<Team> teams;

    public Auction() {
        teams = new LinkedList<>();
    }

    public void addPlayer(Player player) {
        Team team = teams.stream().filter(t -> t.getTeamName().equalsIgnoreCase(player.getTeamName())).findFirst().orElse(null);

        if (team == null) {
            team = new Team(teams.size() + 1, player.getTeamName());
            teams.add(team);
        }
        team.addPlayer(player);
    }

    public void displayTeams() {
        teams.forEach(t -> System.out.println(t.getTeamName()));
    }

    public void displayTeamPlayers(String teamName) {

        teams.stream().filter(t -> t.getTeamName().equalsIgnoreCase(teamName)).findFirst().ifPresentOrElse(Team::displayPlayers,() -> System.out.println("Team not found"));
    }

    public void showPlayerBid(String playerName) {

        for (Team t : teams) {
            if (t.searchPlayer(playerName))
                return;
        }

        System.out.println("Player not found");
    }

    public void displayPlayersByRole(String role) {

        teams.stream().filter(t -> t.hasRole(role)).forEach(t -> t.displayPlayersByRole(role));
    }
}
