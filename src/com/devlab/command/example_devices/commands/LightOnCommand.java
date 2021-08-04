package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;

public class LightOnCommand implements Command {

    LightDevice light;

    public LightOnCommand(LightDevice light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
