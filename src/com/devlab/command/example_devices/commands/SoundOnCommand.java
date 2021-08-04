package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.SoundDevice;

public class SoundOnCommand implements Command {

    SoundDevice sound;

    public SoundOnCommand(SoundDevice sound){
        this.sound = sound;
    }

    @Override
    public void execute() {
        this.sound.on();
    }

    @Override
    public void unexecute() {
        this.sound.off();
    }
}
