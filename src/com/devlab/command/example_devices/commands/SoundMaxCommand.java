package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.SoundDevice;

public class SoundMaxCommand implements Command {

    SoundDevice sound;

    public SoundMaxCommand(SoundDevice sound){
        this.sound = sound;
    }

    @Override
    public void execute() {
        this.sound.volume(100);
    }

    @Override
    public void unexecute() {
        this.sound.volume(50);
    }
}
