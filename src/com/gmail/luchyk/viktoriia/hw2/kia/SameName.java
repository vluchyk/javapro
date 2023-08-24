package com.gmail.luchyk.viktoriia.hw2.kia;

import com.gmail.luchyk.viktoriia.hw2.Car;
import com.gmail.luchyk.viktoriia.hw2.Employee;

public class SameName extends Car {
    private static final String BRAND = "KIA";

    public SameName(String color, Employee employee) {
        super(BRAND, color, employee);
    }

    @Override
    public void start() {
        super.start();
        checkMusicPlayer();
    }

    private void checkMusicPlayer() {
        System.out.println("The music player is successfully checked.");
    }
}