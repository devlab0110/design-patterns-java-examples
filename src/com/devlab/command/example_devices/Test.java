package com.devlab.command.example_devices;

import com.devlab.command.example_devices.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("Prepare commands:");
        System.out.println("- light on");
        System.out.println("- sound on");
        System.out.println("");
        System.out.println("- light blue");
        System.out.println("- light green");
        System.out.println("- light red");
        System.out.println("");
        System.out.println("- sound max");
        System.out.println("");
        System.out.println("- light off");
        System.out.println("- sound off");
        System.out.println("");

        LightDevice light = new LightDevice();
        SoundDevice sound = new SoundDevice();

        List<Command> commands = new ArrayList<>();

        // light on / sound on
        commands.add(new LightOnCommand(light));
        commands.add(new SoundOnCommand(sound));


        // light blue / light green / light red
        commands.add(new LightBlueCommand(light));
        commands.add(new LightGreenCommand(light));
        commands.add(new LightRedCommand(light));

        // sound max
        commands.add(new SoundMaxCommand(sound));

        // light off / sound off
        commands.add(new LightOffCommand(light));
        commands.add(new SoundOffCommand(sound));


        System.out.println("MANAGER ------------------");
        System.out.println("running:");
        Manager manager = new Manager(commands);
        manager.run();







    }

}
