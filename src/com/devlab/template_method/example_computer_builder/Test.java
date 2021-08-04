package com.devlab.template_method.example_computer_builder;



public class Test {

    public static void main(String[] args) {

        System.out.println("Standart ------------------");
        ComputerBuilder builderStandart = new StandardComputerBuilder();
        builderStandart.build();


        System.out.println("HighEnd ------------------");
        ComputerBuilder builderHighEnd = new HighEndComputerBuilder();
        builderHighEnd.build();


    }

}
