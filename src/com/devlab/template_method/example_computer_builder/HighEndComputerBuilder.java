package com.devlab.template_method.example_computer_builder;

import com.devlab.template_method.example_computer_builder.ComputerBuilder;
import com.devlab.template_method.example_computer_builder.stuff.PartA;

public class HighEndComputerBuilder extends ComputerBuilder {

        @Override
        public void addMotherboard() {
            System.out.println("HighEndComputerBuilder : addMotherboard");
            parts.add(new PartA());
        }

        @Override
        public void setupMotherboard() {
            System.out.println("HighEndComputerBuilder : setupMotherboard");
        }

        @Override
        public void addProcessor() {
            System.out.println("HighEndComputerBuilder : addProcessor");
            parts.add(new PartA());
        }

}
