package com.devlab.decorator.example_product;

public class DecoratorFoo extends Decorator{

    public DecoratorFoo(iProduct product) {
        super(product);
        this.name = "foo";
        this.desc = "foo desc";
        this.price = 1;
    }


}
