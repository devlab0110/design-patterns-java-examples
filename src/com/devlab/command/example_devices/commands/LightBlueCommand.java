package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightBlueCommand implements Command {

    LightDevice light;

    public LightBlueCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.color("blue");
    }

    @Override
    public void unexecute() {
        this.light.color("white");
    }
}
