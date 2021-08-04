package com.devlab.bridge.example_view.stuff;

public class Album {

    private String name;
    private String cover;
    private String desc;

    public Album(String name, String cover, String desc){
        this.name = name;
        this.cover = cover;
        this.desc   = desc;
    }

    public String getName() {
        System.out.print("album.name");
        return name;
    }

    public String getCover() {
        System.out.print("album.cover");
        return cover;
    }

    public String getDesc() {
        System.out.print("album.desc");
        return desc;
    }
}
