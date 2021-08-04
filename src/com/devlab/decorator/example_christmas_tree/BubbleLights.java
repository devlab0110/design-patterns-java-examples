package com.devlab.decorator.example_christmas_tree;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + ", with Bubble Lights";
    }


}