package com.devlab.state.example_player;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");

        List<String> playlist = new ArrayList<>();
        playlist.add("Track 1");
        playlist.add("Track 2");
        playlist.add("Track 3");

        Player player = new Player(playlist);
        player.getState().play();
        player.getState().lock();
        player.getState().next();
        player.getState().previous();

    }

}
