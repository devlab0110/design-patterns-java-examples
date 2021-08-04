package com.devlab.bridge.example_view;

import com.devlab.bridge.example_view.stuff.Artist;

public class ArtistResource implements Resource {

    Artist artist;
    public ArtistResource(Artist artist){
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return artist.getNames();
    }

    @Override
    public String getText() {
        return artist.getBio();
    }

    @Override
    public String getImage() {
        return artist.getPhoto();
    }
}
