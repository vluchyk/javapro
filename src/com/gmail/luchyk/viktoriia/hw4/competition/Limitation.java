package com.gmail.luchyk.viktoriia.hw4.competition;

public class Limitation {
    private double runLimit;
    private double jumpLimit;

    public Limitation(double runLimit, double jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public double getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(double runLimit) {
        this.runLimit = runLimit;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }
}
