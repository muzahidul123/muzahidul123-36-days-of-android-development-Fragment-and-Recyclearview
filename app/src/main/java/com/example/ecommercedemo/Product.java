package com.example.ecommercedemo;

public class Product {

    private String name;
    private String price;
    private Integer image;

    public Product() {
    }

    public Product(String name, String price, Integer image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getImage() {
        return image;
    }
}
