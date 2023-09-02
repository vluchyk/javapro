package com.gmail.luchyk.viktoriia.hw4.competition;

public class Obstacle {
    private final String name;
    private final String action;
    private double length;

    public Obstacle(String name, String action, double length) {
        this.name = name;
        this.action = action;
        this.length = length;
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
        System.out.println("Overcome is " + this.name);
    }
}
