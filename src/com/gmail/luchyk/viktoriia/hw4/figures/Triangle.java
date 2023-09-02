package com.gmail.luchyk.viktoriia.hw4.figures;

public class Triangle implements Shape {
    private static final String FIGURE_NAME = "Triangle";
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = this.perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.firstSide) * (halfPerimeter - this.secondSide) * (halfPerimeter - this.thirdSide));
    }

    @Override
    public void printInfo() {
        System.out.printf("%s: AB = %.2f, BC = %.2f, AC = %.2f, area = %.2f\n", FIGURE_NAME, this.firstSide, this.secondSide, this.thirdSide, calculateArea());
    }
}