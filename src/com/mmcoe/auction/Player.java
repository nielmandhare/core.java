package com.mmcoe.auction;

public class Player {

    private String name;
    private String role;
    private int bid;
    private String teamName;

    public Player(String name, String role, int bid, String teamName) {
        this.name = name;
        this.role = role;
        this.bid = bid;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getBid() {
        return bid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
        System.out.println("Bid : " + bid);
        System.out.println("Team : " + teamName);
    }

    @Override
    public String toString() {
        return "Player [Name=" + name + ", Role=" + role +
               ", Bid=" + bid + ", Team=" + teamName + "]";
    }
}
