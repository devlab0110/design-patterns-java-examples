package com.devlab.state.example_player;

public abstract class State {

    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract void lock();
    public abstract void play();
    public abstract void next();
    public abstract void previous();

}
