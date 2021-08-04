package com.devlab.state.example_delivery;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("ReceivedState : not supported next!");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void status() {
        System.out.println("ReceivedState : Package is delivered");
    }
}