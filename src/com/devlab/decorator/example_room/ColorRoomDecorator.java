package com.devlab.decorator.example_room;

public class ColorRoomDecorator extends RoomDecorator {

    private String color;

    public ColorRoomDecorator(Room room, String color) {
        super(room);
        this.color = color;
    }

    @Override
    public String getDesc() {
        return room.getDesc() + ", color: "+color;
    }

}
