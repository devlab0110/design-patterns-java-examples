package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightRedCommand implements Command {

    LightDevice light;

    public LightRedCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.color("red");
    }

    @Override
    public void unexecute() {
        this.light.color("white");
    }
}
