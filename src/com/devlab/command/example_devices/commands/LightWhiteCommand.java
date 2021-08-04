package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightWhiteCommand implements Command {

    LightDevice light;

    public LightWhiteCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.color("white");
    }

    @Override
    public void unexecute() {
        this.light.color("white");
    }
}
