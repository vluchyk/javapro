package com.gmail.luchyk.viktoriia.hw4.competition;

public class Passage {
    private Participant participant;
    private Obstacle obstacle;

    public Passage(Participant participant, Obstacle obstacle) {
        this.participant = participant;
        this.obstacle = obstacle;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public boolean isPassed() {
        if ("run".equalsIgnoreCase(this.obstacle.getAction())) {
            return (this.participant.getActionLimit().getRunLimit() > this.obstacle.getLength());
        } else if ("jump".equalsIgnoreCase(this.obstacle.getAction())) {
            return (this.participant.getActionLimit().getJumpLimit() > this.obstacle.getLength());
        } else {
            System.out.println("Unknown action of the obstacle.");
            return false;
        }
    }

    public void printAction() {
        if ("run".equalsIgnoreCase(this.obstacle.getAction())) {
            this.participant.run();
            this.obstacle.overcome();
        } else if ("jump".equalsIgnoreCase(this.obstacle.getAction())) {
            this.participant.jump();
            this.obstacle.overcome();
        } else {
            System.out.println();
        }
    }
}
