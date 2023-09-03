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

    private boolean isPassed() {
        if ("run".equalsIgnoreCase(this.obstacle.getAction())) {
            return (this.participant.getActionLimit().getRunLimit() > this.obstacle.getLength());
        } else if ("jump".equalsIgnoreCase(this.obstacle.getAction())) {
            return (this.participant.getActionLimit().getJumpLimit() > this.obstacle.getLength());
        } else {
            System.out.println("Unknown action of the obstacle.");
            return false;
        }
    }

    private void printAction() {
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

    private static void printResult(Passage passage, int distance) {
        if (passage.isPassed()) {
            System.out.printf("Participant %s %s passed %s %s at the distance %d.\n", passage.getParticipant().getKind(), passage.getParticipant().getName(), passage.getObstacle().getKind(), passage.getObstacle().getName(), distance);
        } else {
            System.out.printf("Participant %s %s didn't pass %s %s at the distance %d. Passed %d.\n", passage.getParticipant().getKind(), passage.getParticipant().getName(), passage.getObstacle().getKind(), passage.getObstacle().getName(), distance, distance - 1);
        }
    }

    public static void competition(Participant[] participants, Obstacle[] obstacles) {
        int distance;
        for (Participant participant : participants) {
            distance = 0;
            for (Obstacle obstacle : obstacles) {
                distance++;
                Passage passage = new Passage(participant, obstacle);
                passage.printAction();
                printResult(passage, distance);
                if (!passage.isPassed()) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
