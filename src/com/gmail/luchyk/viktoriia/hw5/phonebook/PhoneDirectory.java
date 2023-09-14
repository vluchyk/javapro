package com.gmail.luchyk.viktoriia.hw5.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private static List<Record> records;

    public PhoneDirectory() {
        this.records = new ArrayList<>();
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void add(Record record) {
        this.records.add(record);
    }

    public static void find(String fullName) {
        String foundPhone = "";
        for (Record record : records) {
            if (record.getFullName().equalsIgnoreCase(fullName)) {
                foundPhone = record.getPhone();
                break;
            }
        }
        if ("".equals(foundPhone)) {
            System.out.printf("Nothing is found for the user %s.\n", fullName);
        } else {
            System.out.printf("The first phone number found for the user %s is %s.\n", fullName, foundPhone);
        }
    }

    public static void findAll(String fullName) {
        List<String> foundPhones = new ArrayList<>();
        for (Record record : records) {
            if (record.getFullName().equalsIgnoreCase(fullName)) {
                foundPhones.add(record.getPhone());
            }
        }
        if (foundPhones.isEmpty()) {
            System.out.printf("Nothing is found for the user %s.\n", fullName);
        } else {
            System.out.printf("The phone number found for the user %s: %s.\n", fullName, foundPhones);
        }
    }
}