package com.gmail.luchyk.viktoriia.hw4.competition;

public class Obstacle {
    private final String kind;
    private final String name;
    private final String action;
    private double length;

    public Obstacle(String kind, String name, String action, double length) {
        this.kind = kind;
        this.name = name;
        this.action = action;
        this.length = length;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void overcome() {
        System.out.printf("Overcome is %s %s.\n", this.kind, this.name);
    }
}
