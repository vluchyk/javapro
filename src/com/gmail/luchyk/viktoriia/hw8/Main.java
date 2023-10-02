package com.gmail.luchyk.viktoriia.hw8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getData();

        System.out.println("___ Input data: ___");
        printInfo(products);
        System.out.println();

        printInfo(byTypeByPrice(products, "Book", 250));
        System.out.println();

        printInfo(byTypeWithDiscount(products, "Book", 10));
        System.out.println();

        minPriceByType(products, "Book");
        System.out.println();
        minPriceByType(products, "Magazine");
        System.out.println();

        printInfo(lastNCreated(products, 3));
        System.out.println();

        totalPrice(products, 2023, "Book", 75);
        System.out.println();

        System.out.println(groupByType(products));
    }

    private static void printInfo(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static List<Product> byTypeByPrice(List<Product> products, String type, double minPrice) {
        System.out.printf("___ Result of Type = %s, price > %.2f: ___\n", type, minPrice);
        return products.stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .filter(p -> p.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    private static List<Product> byTypeWithDiscount(List<Product> products, String type, int percentage) {
        System.out.printf("___ Result of Type = %s, with discount = %d%%: ___\n", type, percentage);
        return products.stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .filter(Product::isDiscount)
                /*
                .map(product -> {
                    product.setPrice(product.getPrice() - product.getPrice() * percentage / 100);
                    return product;
                })
                */
                .peek(product -> product.setPrice(product.getPrice() - product.getPrice() * percentage / 100))
                .collect(Collectors.toList());
    }

    private static void minPriceByType(List<Product> products, String type) {
        System.out.printf("___ Result of Type = %s with min price: ___\n", type);
        products.stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .findFirst()
                .min(Comparator.comparing(Product::getPrice))
                .ifPresentOrElse(System.out::println, () -> System.out.printf("The product %s is not found.\n", type));
    }

    private static List<Product> lastNCreated(List<Product> products, int lastN) {
        System.out.printf("___ Result of last %d created products: ___\n", lastN);
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreated).reversed())
                .limit(lastN)
                .collect(Collectors.toList());
    }

    private static void totalPrice(List<Product> products, int year, String type, double maxPrice) {
        System.out.printf("___ Result of total price created in %d of Type = %s, and price <= %.2f:  ___\n", year, type, maxPrice);
        double result = products.stream()
                .filter(d -> d.getCreated().getYear() == year)
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .filter(p -> p.getPrice() <= maxPrice)
                .mapToDouble(Product::getPrice)
                .sum();
        //.collect(Collectors.summingDouble(Product::getPrice));

        System.out.printf("Total Price: %.2f.\n", result);
    }

    private static Map<String, List<Product>> groupByType(List<Product> products) {
        System.out.println("___ Result of products grouped by type: ___");
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    private static List<Product> getData() {
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

        products.add(new Product.Builder()
                .withId(100005)
                .withType("Book")
                .withPrice(65)
                .withDiscount(true)
                .withCreated(LocalDate.parse("2022-04-27"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100006)
                .withType("Notebook")
                .withPrice(55)
                .withDiscount(false)
                .withCreated(LocalDate.parse("2023-01-25"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100007)
                .withType("Book")
                .withPrice(35)
                .withDiscount(false)
                .withCreated(LocalDate.parse("2023-02-25"))
                .build()
        );

        products.add(new Product.Builder()
                .withId(100008)
                .withType("Book")
                .withPrice(50)
                .withDiscount(true)
                .withCreated(LocalDate.parse("2023-03-17"))
                .build()
        );

        return products;
    }
}
