package com.gmail.luchyk.viktoriia.hw10;

import com.gmail.luchyk.viktoriia.hw10.exceptions.BookNotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String root = "src/com/gmail/luchyk/viktoriia/hw10/resources/";

    public static void main(String[] args) throws IOException {
        String answer;
        do {
            Book source = getFrom();
            File result = putTo();

            Statistics data = new Statistics(source, result);
            try {
                data.nMostPopularWords(10);
            } catch (BookNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println("Some message"); //TO-DO
            }

            System.out.println("Again? Y/N:");
            answer = scanner.nextLine();
        } while ("Y".equalsIgnoreCase(answer));

        scanner.close();
    }

    private static Book getFrom() {
        Book book;
        boolean isWrongName;
        do {
            isWrongName = false;
            System.out.print("Specify the name of the book: ");
            String name = scanner.nextLine();
            String path = root + name + ".txt";
            book = new Book(path);
            try {
                book.verify();
            } catch (BookNotFoundException e) {
                System.out.println(e);
                isWrongName = true;
            }
        } while (isWrongName);
        return book;
    }

    private static File putTo() {
        System.out.print("Specify the name of the file to save the statistics: ");
        String name = scanner.nextLine();
        String path = root + name + "_statistic.txt";
        return new File(path);
    }
}
