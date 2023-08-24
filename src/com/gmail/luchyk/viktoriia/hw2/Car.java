package com.gmail.luchyk.viktoriia.hw2;

public class Car {
    private final String brand;
    private String color;
    private Employee employee;

    public Car(String brand, String color, Employee employee) {
        this.brand = brand;
        this.color = color;
        this.employee = employee;
    }

    public void start() {
        printEmployeeInfo();
        startCommand();
        startElectricity();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("The electricity is checked and successfully launched.");
    }

    private void startCommand() {
        System.out.printf("The car %s (color: %s) is running.\n", this.brand, this.color);
    }

    private void startFuelSystem() {
        System.out.println("The fuel system is checked. Can be successfully used.");
    }

    private void printEmployeeInfo() {
        System.out.println("The employee who tested a car: " + employee.fullName() + ", " + employee.getPosition());
    }
}
