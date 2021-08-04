package com.devlab.state.example_player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private boolean playing = false;
    private List<String> playlist;
    private int currentTrack = 0;

    public Player(List<String> playlist) {
        this.playlist = playlist;
        this.state = new ReadyState(this);
        setPlaying(true);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void startPlayback() {

        System.out.println("--StartPlayback " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        System.out.println("--NextTrack " + playlist.get(currentTrack));


    }

    public void previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        System.out.println("--PreviousTrack " + playlist.get(currentTrack));
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}