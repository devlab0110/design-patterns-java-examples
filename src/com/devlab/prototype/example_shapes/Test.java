package com.devlab.prototype.example_shapes;




public class Test {

    public static void main(String[] args) {

        //...........................
        Shape circle = new Circle();
        circle.x = 10;
        circle.y = 20;

        Shape circle2 = circle.clone();


        System.out.println("------------------");

    }

}
