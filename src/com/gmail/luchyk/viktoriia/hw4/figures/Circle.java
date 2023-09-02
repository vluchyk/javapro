package com.gmail.luchyk.viktoriia.hw4.figures;

public class Circle implements Shape {
    private static final double PI = 3.14159;
    private static final String FIGURE_NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public void printInfo() {
        System.out.printf("%s: radius = %.2f, area = %.2f\n", FIGURE_NAME, this.radius, calculateArea());
    }
}
