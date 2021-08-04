package com.devlab.state.example_player;

public class PlayingState extends State {

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public void lock() {
        System.out.println("PlayingState.onLock >>> setCurrentTrack >>> LockedState");
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();

    }

    @Override
    public void play() {
        System.out.println("PlayingState.onPlay >>> ReadyState");
        player.changeState(new ReadyState(player));

    }

    @Override
    public void next() {
        System.out.println("PlayingState.onNext >>> nextTrack");
        player.nextTrack();
    }

    @Override
    public void previous() {
        System.out.println("PlayingState.onPrevious >>> previousTrack");
        player.previousTrack();
    }
}