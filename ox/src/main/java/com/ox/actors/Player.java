package com.ox.actors;


public abstract class Player {

    private String name;
    private int points = 0;
    private Character playerSymbol= ' ';

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    public Character getPlayerSymbol() {
        return playerSymbol;
    }

    public void addPoint() {
        points++;
    }

    public void setPlayerSymbol(Character playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public abstract void makeMove();
}
