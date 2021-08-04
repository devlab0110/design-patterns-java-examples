package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightOffCommand implements Command {

    LightDevice light;

    public LightOffCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void unexecute() {
        this.light.on();
    }
}
