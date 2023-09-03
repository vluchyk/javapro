package com.gmail.luchyk.viktoriia.hw4.competition;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("John Smith", new Limitation(25.25, 1.5)),
                new Cat("Tom", new Limitation(30, 1)),
                new Robot("Dayson", new Limitation(20.5, 0.5))
        };

        Obstacle[] obstacles = {
                new Racetrack("R1", 22),
                new Wall("W1", 1.2)
        };

        Passage.competition(participants, obstacles);
    }
}