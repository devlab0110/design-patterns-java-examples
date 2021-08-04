package com.devlab.template_method.example_computer_builder;

import com.devlab.template_method.example_computer_builder.stuff.Computer;
import com.devlab.template_method.example_computer_builder.stuff.Part;

import java.util.ArrayList;
import java.util.List;

public abstract class ComputerBuilder {

    protected List<Part> parts;

    public ComputerBuilder(){
        parts = new ArrayList<>();
    }

    public final Computer build() {

        addMotherboard();
        setupMotherboard();
        addProcessor();

        return new Computer(parts);
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();

}
