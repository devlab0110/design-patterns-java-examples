package com.devlab.null_object.example_shapes;



public class Test {

    public static void main(String[] args) {

        String[] types = new String[] {
            "Circle",
            "Triangle",
            "Rectangle",
            "Pentagon",
            null
        };
        for (String type : types) {
            Shape shape = Factory.create(type);
            shape.draw();
        }

    }

}
