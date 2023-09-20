package com.gmail.luchyk.viktoriia.hw7.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("John Smith");
        board.add("Tom Taylor");
        board.add("Ann Barton");
        board.add("Barbara Drayton");
        board.add("Merry Hill");
        board.add("David Black");
        board.draw();
        System.out.println();

        board.deliver();
        board.draw();
        System.out.println();

        board.deliver();
        board.draw();
        System.out.println();

        board.deliver(5);
        board.draw();
        System.out.println();

        board.add("Eric Paterson");
        board.add("Rebeka Klarkson");
        board.draw();
        System.out.println();
    }
}
