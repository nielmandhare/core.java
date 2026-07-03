package com.mmcoe.auction;

import java.util.LinkedList;

public class Team {

    private int teamId;
    private String teamName;
    private LinkedList<Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        players = new LinkedList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void displayPlayers() {
        System.out.println("\nTeam : " + teamName);
        players.forEach(Player::display);
    }

    public boolean searchPlayer(String name) {
        return players.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().map(p -> {p.display();return true;}).orElse(false);
    }

    public void displayPlayersByRole(String role) {
        System.out.println("\n" + role + "s in " + teamName + ":");
        players.stream().filter(p -> p.getRole().equalsIgnoreCase(role)).forEach(Player::display);
    }

    public void showBids() {
        System.out.println("\nBids of " + teamName + ":");
        players.forEach(p -> System.out.println(p.getName() + " : " + p.getBid()));
    }

    public boolean hasRole(String role) {
        return players.stream().anyMatch(p -> p.getRole().equalsIgnoreCase(role));
    }
}
