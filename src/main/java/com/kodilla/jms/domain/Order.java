package com.kodilla.jms.domain;


import java.io.Serializable;

public class Order implements Serializable {

    private int id;
    private String name;
    private int quantity;
    private double price;

    public Order(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
