package com.gmail.luchyk.viktoriia.hw4.figures;

public class Rectangle implements Shape {
    private static final String FIGURE_NAME = "Rectangle";
    private double width;
    private double height;

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public void printInfo() {
        System.out.printf("%s: width = %.2f, height = %.2f, area = %.2f\n", FIGURE_NAME, this.width, this.height, calculateArea());
    }
}
