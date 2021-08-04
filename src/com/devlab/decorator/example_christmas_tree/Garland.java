package com.devlab.decorator.example_christmas_tree;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + ", with Garland";
    }


}