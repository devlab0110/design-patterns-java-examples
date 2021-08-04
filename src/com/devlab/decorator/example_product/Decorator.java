package com.devlab.decorator.example_product;

public abstract class Decorator implements iProduct {

    protected iProduct product;

    protected String name;
    protected String desc;
    protected int price;

    public Decorator(iProduct product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName() + ", "+ name;
    }

    @Override
    public String getDesc() {
        return product.getDesc() + ", "+ desc;
    }

    @Override
    public int getPrice() {
        return product.getPrice() + price;
    }

}
