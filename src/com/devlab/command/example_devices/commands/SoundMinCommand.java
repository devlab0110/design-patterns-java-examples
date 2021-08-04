package com.devlab.command.example_devices.commands;

import com.devlab.command.example_devices.Command;
import com.devlab.command.example_devices.SoundDevice;

public class SoundMinCommand implements Command {

    SoundDevice sound;

    public SoundMinCommand(SoundDevice sound){
        this.sound = sound;
    }

    @Override
    public void execute() {
        this.sound.volume(10);
    }

    @Override
    public void unexecute() {
        this.sound.volume(50);
    }
}
