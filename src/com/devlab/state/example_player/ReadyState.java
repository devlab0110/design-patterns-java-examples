package com.devlab.state.example_player;

public class ReadyState  extends State {

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public void lock() {
        System.out.println("ReadyState.lock >>> LockedState");
        player.changeState(new LockedState(player));

    }

    @Override
    public void play() {
        System.out.println("ReadyState.onPlay >>> startPlayback >>> PlayingState");
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void next() {
        System.out.println("ReadyState.onNext >>> ...");
    }

    @Override
    public void previous() {
        System.out.println("ReadyState.onPrevious >>> ...");
    }
}