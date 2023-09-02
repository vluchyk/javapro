package com.gmail.luchyk.viktoriia.hw4.competition;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Participant("Human", new Limitation(25.25, 1.5)),
                new Participant("Cat", new Limitation(30, 1)),
                new Participant("Robot", new Limitation(20.5, 0.5))
        };

        Obstacle[] obstacles = {
                new Obstacle("Racetrack", "run", 22),
                new Obstacle("Wall", "jump", 1.2)
        };

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

    public static void printResult(Passage passage, int distance) {
        if (passage.isPassed()) {
            System.out.printf("Participant %s passed %s obstacle at the distance %d.\n", passage.getParticipant().getName(), passage.getObstacle().getName(), distance);
        } else {
            System.out.printf("Participant %s didn't pass %s obstacle at the distance %d. Passed %d.\n", passage.getParticipant().getName(), passage.getObstacle().getName(), distance, distance - 1);
        }
    }
}