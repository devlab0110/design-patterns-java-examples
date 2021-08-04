package com.devlab.decorator.example_christmas_tree;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree){
        this.tree = tree;
    }

    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}