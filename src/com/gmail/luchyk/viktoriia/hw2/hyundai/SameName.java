package com.gmail.luchyk.viktoriia.hw2.hyundai;

import com.gmail.luchyk.viktoriia.hw2.Car;
import com.gmail.luchyk.viktoriia.hw2.Employee;

public class SameName extends Car {
    private static final String BRAND = "Hyundai";

    public SameName(String color, Employee employee) {
        super(BRAND, color, employee);
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
