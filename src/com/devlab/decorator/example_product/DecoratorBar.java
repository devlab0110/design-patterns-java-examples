package com.devlab.decorator.example_product;

public class DecoratorBar extends Decorator{

    public DecoratorBar(iProduct product) {
        super(product);
        this.name = "bar";
        this.desc = "bar desc";
        this.price = 2;
    }

}
