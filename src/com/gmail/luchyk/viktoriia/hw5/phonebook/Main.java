package com.gmail.luchyk.viktoriia.hw5.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        fill(phoneDirectory);
        PhoneDirectory.find("John Smith");
        PhoneDirectory.findAll("John Smith");
        System.out.println();
        PhoneDirectory.find("Tom Black");
        PhoneDirectory.findAll("Tom Black");
        System.out.println();
        PhoneDirectory.find("Ann Barton");
        PhoneDirectory.findAll("Ann Barton");
        System.out.println();
        PhoneDirectory.find("Tom Smith");
        PhoneDirectory.findAll("Tom Smith");
    }

    private static void fill(PhoneDirectory phoneDirectory) {
        phoneDirectory.add(new Record("John Smith", "+380662520001"));
        phoneDirectory.add(new Record("Tom Black", "+380662520002"));
        phoneDirectory.add(new Record("Barbara Grey", "+380662520003"));
        phoneDirectory.add(new Record("Jack Marton", "+380662520004"));
        phoneDirectory.add(new Record("John Smith", "+380662520005"));
        phoneDirectory.add(new Record("Ann Barton", "+380662520006"));
        phoneDirectory.add(new Record("Tom Black", "+380662520007"));
        phoneDirectory.add(new Record("Merry Smith", "+380662520008"));
        phoneDirectory.add(new Record("John Smith", "+380662520009"));
        phoneDirectory.add(new Record("Ketty Drayton", "+380662520010"));
    }
}
