package com.gmail.luchyk.viktoriia.hw2;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String firstName, String middleName, String lastName, String position, String email, String phone, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
}
