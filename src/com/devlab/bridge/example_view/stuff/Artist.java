package com.devlab.bridge.example_view.stuff;

public class Artist {

    private String names;
    private String photo;
    private String bio;

    public Artist(String names, String photo, String bio){
        this.names = names;
        this.photo = photo;
        this.bio   = bio;
    }

    public String getNames() {
        System.out.print("artist.names");
        return names;
    }

    public String getPhoto() {
        System.out.print("artist.photo");
        return photo;
    }

    public String getBio() {
        System.out.print("artist.bio");
        return bio;
    }
}
