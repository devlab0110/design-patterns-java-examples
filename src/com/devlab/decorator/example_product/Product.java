package com.devlab.decorator.example_product;

public class Product implements iProduct {

    private String name;
    private String desc;
    private int price;

    public Product(
            String name,
            String desc,
            int price
    ){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
