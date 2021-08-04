package com.devlab.state.example_delivery;

public class Package {

    private PackageState state = new OrderedState();


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.status();
    }

    public void setState(PackageState state){
        this.state = state;
    }
}