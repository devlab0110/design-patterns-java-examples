package com.devlab.template_method.example_computer_builder;

import com.devlab.template_method.example_computer_builder.ComputerBuilder;
import com.devlab.template_method.example_computer_builder.stuff.PartA;

public class StandardComputerBuilder extends ComputerBuilder {

        @Override
        public void addMotherboard() {
            System.out.println("StandardComputerBuilder : addMotherboard");
            parts.add(new PartA());
        }

        @Override
        public void setupMotherboard() {
            System.out.println("StandardComputerBuilder : setupMotherboard");
        }

        @Override
        public void addProcessor() {
            System.out.println("StandardComputerBuilder : addProcessor");
            parts.add(new PartA());
        }

}
