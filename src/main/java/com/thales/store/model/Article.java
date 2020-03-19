package com.thales.store.model;

import java.util.Objects;

public class Article {

    private String name;

    private String label;

    private double price;

    private int stock;

    public Article(String name, String label, double price, int stock) {
        this.name = name;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLabel(), getPrice(), getStock());
    }
}
