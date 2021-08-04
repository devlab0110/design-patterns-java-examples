package com.devlab.decorator.example_room;

public abstract class RoomDecorator implements Room{

    protected Room room;

    public RoomDecorator(Room room){
        this.room = room;
    }

}
