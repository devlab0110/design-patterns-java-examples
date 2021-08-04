package com.devlab.command.example_devices;

public class SoundDevice {

    public void on(){
        System.out.println("Sound: on!");
    }
    public void off(){
        System.out.println("Sound: off!");
    }
    public void volume(int percentage){
        System.out.println("Sound set volume to: " + percentage +"% !");
    }

}
