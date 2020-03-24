package com.thales.store.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}