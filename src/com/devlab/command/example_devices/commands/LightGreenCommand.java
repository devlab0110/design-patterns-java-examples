package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightGreenCommand implements Command {

    LightDevice light;

    public LightGreenCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.color("green");
    }

    @Override
    public void unexecute() {
        this.light.color("white");
    }
}
