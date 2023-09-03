package com.gmail.luchyk.viktoriia.hw4.competition;

public class Participant {
    private final String kind;
    private final String name;
    private Limitation actionLimit;

    public Participant(String kind, String name, Limitation actionLimit) {
        this.kind = kind;
        this.name = name;
        this.actionLimit = actionLimit;
    }

    public String getKind() {
        return kind;
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
        System.out.printf("%s %s is running.\n", this.kind, this.name);
    }

    public void jump() {
        System.out.printf("%s %s is jumping.\n", this.kind, this.name);
    }
}
