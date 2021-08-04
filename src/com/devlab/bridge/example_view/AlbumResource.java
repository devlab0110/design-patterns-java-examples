package com.devlab.bridge.example_view;

import com.devlab.bridge.example_view.stuff.Album;

public class AlbumResource implements Resource {

    Album album;
    public AlbumResource(Album album){
        this.album = album;
    }

    @Override
    public String getTitle() {
        return album.getName();
    }

    @Override
    public String getText() {
        return album.getDesc();
    }

    @Override
    public String getImage() {
        return album.getCover();
    }
}
