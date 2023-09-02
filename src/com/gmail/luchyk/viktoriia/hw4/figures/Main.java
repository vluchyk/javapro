package com.gmail.luchyk.viktoriia.hw4.figures;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Circle(2.5),
                new Triangle(1.3, 2.4, 3.5),
                new Rectangle(3.2),
                new Rectangle(2, 3)
        };

        calculateAreaTotal(figures);
    }

    public static void calculateAreaTotal(Shape[] figures) {
        double areaTotal = 0;
        for (Shape figure : figures) {
            figure.printInfo();
            areaTotal += figure.calculateArea();
        }
        System.out.printf("Total Area = %.2f", areaTotal);
    }
}
