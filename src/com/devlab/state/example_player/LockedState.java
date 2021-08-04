package com.devlab.state.example_player;

public class LockedState extends State {

    LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public void lock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            System.out.println("LockedState.onLock >>> ReadyState");
        } else {
            System.out.println("LockedState.onLock >>> ...");
        }
    }

    @Override
    public void play() {
        System.out.println("LockedState.onPlay >>> ReadyState");
        player.changeState(new ReadyState(player));

    }

    @Override
    public void next() {
        System.out.println("LockedState.onNext >>> ...");
    }

    @Override
    public void previous() {
        System.out.println("LockedState.onPrevious >>> ...");
    }
}
