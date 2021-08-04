package com.devlab.decorator.example_room;




public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("RawRoom:");
        Room room = new RawRoom();
        System.out.println("desc: "+room.getDesc());
        System.out.println("");

        System.out.println("------------------");
        System.out.println("DecoratedA:");
        System.out.println("- color: red");
        System.out.println("- windows: 3");
        System.out.println("- dors: 1");
        Room roomColor = new ColorRoomDecorator(room, "red");
        Room roomWindows = new WindowRoomDecorator(roomColor, 3);
        Room roomDoor = new DoorRoomDecorator(roomWindows, 1);
        System.out.println("desc: "+roomDoor.getDesc());
        System.out.println("");


        System.out.println("------------------");
        System.out.println("DecoratedB:");
        System.out.println("- color: green");
        System.out.println("- windows: 1");
        System.out.println("- dors: 2");
        Room roomColor2 = new ColorRoomDecorator(room, "green");
        Room roomWindows2 = new WindowRoomDecorator(roomColor2, 1);
        Room roomDoor2 = new DoorRoomDecorator(roomWindows2, 2);
        System.out.println("desc: "+roomDoor2.getDesc());
        System.out.println("");

    }

}
