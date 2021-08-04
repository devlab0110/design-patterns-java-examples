package com.devlab.command.example_devices;

import java.util.List;

public class Manager {

    private List<Command> commands;

    public Manager(List<Command> commands){
        this.commands = commands;
    }

    public void run(){
        for(Command command : commands){
            command.execute();
        }
    }


}
