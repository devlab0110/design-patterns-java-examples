package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.LightDevice;
import com.devlab.command.example_devices.SoundDevice;

public class SoundOffCommand implements Command {

    SoundDevice sound;

    public SoundOffCommand(SoundDevice sound){
        this.sound = sound;
    }

    @Override
    public void execute() {
        this.sound.off();
    }

    @Override
    public void unexecute() {
        this.sound.on();
    }
}
