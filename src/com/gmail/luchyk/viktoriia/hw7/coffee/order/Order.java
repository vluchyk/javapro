package com.gmail.luchyk.viktoriia.hw7.coffee.order;

public class Order {
    private final int orderNumber;
    private final String fullName;
    private static int orderCount = 0;

    public Order(String fullName) {
        orderCount++;
        this.orderNumber = orderCount;
        this.fullName = fullName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return orderNumber + " | " + fullName;
    }
/*
    @Override
    public int compareTo(Order o) {
        return this.orderNumber - o.orderNumber;
    }
 */
}