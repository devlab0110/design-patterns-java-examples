package com.devlab.decorator.example_christmas_tree;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + ", with Tinsel";
    }


}