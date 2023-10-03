package com.gmail.luchyk.viktoriia.hw8;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate created;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getCreated() {
        return created;
    }

    public static class Builder {
        private Product product;

        public Builder() {
            product = new Product();
        }

        public Builder withId(int id) {
            product.id = id;
            return this;
        }

        public Builder withType(String type) {
            product.type = type;
            return this;
        }

        public Builder withPrice(double price) {
            product.price = price;
            return this;
        }

        public Builder withDiscount(boolean discount) {
            product.discount = discount;
            return this;
        }

        public Builder withCreated(LocalDate created) {
            product.created = created;
            return this;
        }

        public Product build() {
            return product;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", created=" + created +
                '}';
    }
}
