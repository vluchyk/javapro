package com.gmail.luchyk.viktoriia.hw2.hyundai;

import com.gmail.luchyk.viktoriia.hw2.Car;

public class SameName extends Car {
    private static final String BRAND = "Hyundai";
    public SameName(String color) {
        super(BRAND, color);
    }

    public void checkList() {
        checkClimateControl();
        checkBrakeSystem();
    }

    private void checkClimateControl() {
        System.out.println("The climate control is successfully checked.");
    }

    private void checkBrakeSystem() {
        System.out.println("The brake system is checked.");
    }
}
