package com.gmail.luchyk.viktoriia.hw7.coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders = new LinkedList<>();

    public void add(String fullName) {
        Order order = new Order(fullName);
        this.orders.add(order);
    }

    public void deliver() {
        Order order = this.orders.poll();
        if (order == null) {
            System.out.println("The queue is empty.");
        } else {
            System.out.printf("Order %d - %s has been delivered.\n", order.getOrderNumber(), order.getFullName());
        }
    }

    public void deliver(int orderNumber) {
        Order order;
        int size = this.orders.size();
        if (size == 0) {
            System.out.println("The queue is empty.");
        } else {
            boolean isFound = false;
            for (int i = 0; i < size; i++) {
                order = this.orders.poll();
                if (order != null) {
                    if (order.getOrderNumber() == orderNumber) {
                        System.out.printf("Order %d - %s has been delivered.\n", order.getOrderNumber(), order.getFullName());
                        isFound = true;
                    } else {
                        this.orders.add(order);
                    }
                }
            }
            if (!isFound) {
                System.out.printf("The order number %d is incorrect.\n", orderNumber);
            }
        }
    }

    public void draw() {
        Order order;
        int size = this.orders.size();
        if (size == 0) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("# | Full Name");
            for (int i = 0; i < size; i++) {
                order = this.orders.poll();
                if (order != null) {
                    System.out.println(order);
                    this.orders.add(order);
                }
            }
        }
    }
}