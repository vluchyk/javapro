package com.gmail.luchyk.viktoriia.hw4.competition;

public class Participant {
    private final String name;
    private Limitation actionLimit;

    public Participant(String name, Limitation actionLimit) {
        this.name = name;
        this.actionLimit = actionLimit;
    }

    public String getName() {
        return name;
    }

    public Limitation getActionLimit() {
        return actionLimit;
    }

    public void setActionLimit(Limitation actionLimit) {
        this.actionLimit = actionLimit;
    }

    public void run() {
        System.out.println(this.name + " is running.");
    }

    public void jump() {
        System.out.println((this.name + " is jumping"));
    }
}
