package com.devlab.command.example_devices;

public class LightDevice {

    public void on(){
        System.out.println("Light: on!");
    }
    public void off(){
        System.out.println("Light: off!");
    }
    public void color(String color){
        System.out.println("Light set color: "+color + "!");
    }


}
