package com.devlab.decorator.example_room;

public class DoorRoomDecorator extends RoomDecorator {

    private int numberOfDoors;

    public DoorRoomDecorator(Room room, int numberOfDoors) {
        super(room);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDesc() {
        String label = "door";
        if(numberOfDoors > 1){
            label = "doors";
        }
        return room.getDesc() + ", "+numberOfDoors+" "+label;
    }

}
