package com.devlab.null_object.example_shapes;

public class Factory {

    public static Shape create(String type){
        Shape shape = null;
        if ("Circle".equals(type)) {
            shape = new Circle();
        }
        else if ("Rectangle".equals(type)) {
            shape = new Rectangle();
        }
        else if ("Triangle".equals(type)) {
            shape = new Triangle();
        }
        else {
            shape = new NullShape();
        }
        return shape;
    }

}
