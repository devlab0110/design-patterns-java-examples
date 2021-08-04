package com.devlab.decorator.example_room;

public class WindowRoomDecorator extends RoomDecorator {

    private int numberOfWindows;

    public WindowRoomDecorator(Room room, int numberOfWindows) {
        super(room);
        this.numberOfWindows = numberOfWindows;
    }


    @Override
    public String getDesc() {
        String label = "window";
        if(numberOfWindows > 1){
            label = "windows";
        }
        return room.getDesc() + ", "+numberOfWindows+" "+label;
    }

}
