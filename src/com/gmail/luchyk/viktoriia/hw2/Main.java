package com.gmail.luchyk.viktoriia.hw2;

import com.gmail.luchyk.viktoriia.hw2.hyundai.SameName;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Tom", "Jn", "Taylor", "Engineer", "tom.taylor@gmail.com", "+380662920101", 40);
        Employee secondEmployee = new Employee("John", "David", "Smith", "Manager", "john.smith@outlook.com", "+380503120508", 35);
        Employee thirdEmployee = new Employee("Robert", "Andrew", "Black", "Engineer", "robert.black@gmail.com", "+380675101514", 25);

        Car[] cars = {
                new Car("Volvo", "Red", firstEmployee),
                new Car("BMW", "White", secondEmployee),
                new com.gmail.luchyk.viktoriia.hw2.kia.SameName("Yellow", firstEmployee),
                new com.gmail.luchyk.viktoriia.hw2.hyundai.SameName("Black", thirdEmployee)
        };

        for (Car car : cars) {
            car.start();
            System.out.println();
        }

        SameName car = new SameName("Grey", secondEmployee);
        car.start();
        car.checkList();
    }
}
