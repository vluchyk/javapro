package com.gmail.luchyk.viktoriia.hw8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getProducts();

        System.out.println("___ Input data: ___");
        printInfo(products);
        System.out.println();

        printInfo(byTypeByPrice(products, "Book", 250));
        System.out.println();

        printInfo(byTypeWithDiscount(products, "Book", 10));
        System.out.println();
    }

    private static void printInfo(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static List<Product> byTypeByPrice(List<Product> products, String type, double price) {
        System.out.printf("___ Result of Type = %s, price > %.2f: ___\n", type, price);
        return products.stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
    }

    private static List<Product> byTypeWithDiscount(List<Product> products, String type, int percentage) {
        System.out.printf("___ Result of Type = %s, with discount = %d: ___\n", type, percentage);
        List<Product> sales = products.stream()
                .filter(Product::isDiscount)
                //p.getPrice() * percentage / 100) //TO-DO
                .collect(Collectors.toList());

        for (Product sale : sales) {
            sale.setPrice(sale.getPrice() - sale.getPrice() * percentage / 100);
        }

        return sales;
    }

    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product.Builder()
                .withId(100001)
                .withType("Book")
                .withPrice(256)
                .withDiscount(false)
                .withCreated(LocalDate.parse("2023-01-01"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100002)
                .withType("Book")
                .withPrice(215)
                .withDiscount(false)
                .withCreated(LocalDate.parse("2023-02-02"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100003)
                .withType("Newspaper")
                .withPrice(100)
                .withDiscount(false)
                .withCreated(LocalDate.parse("2023-01-05"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100004)
                .withType("Book")
                .withPrice(325)
                .withDiscount(true)
                .withCreated(LocalDate.parse("2023-03-03"))
                .build()
        );

        return products;
    }
}
