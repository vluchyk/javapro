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

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String fullName() {
        String fullName = "";
        if (isNotEmpty(this.firstName)) {
            fullName = this.firstName;
        }
        if (isNotEmpty(this.middleName)) {
            fullName += (isNotEmpty(fullName)) ? " " + this.middleName : this.middleName;
        }
        if (isNotEmpty(this.lastName)) {
            fullName += (isNotEmpty(fullName)) ? " " + this.lastName : this.lastName;
        }
        return fullName;
    }

    private boolean isNotEmpty(String str) {
        return str != null && !str.equals("");
    }
}
