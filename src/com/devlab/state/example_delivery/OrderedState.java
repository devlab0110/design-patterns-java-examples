package com.devlab.state.example_delivery;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("OrderedState : Not supported prev!");
    }

    @Override
    public void status() {
        System.out.println("OrderedState : Package is ordered");
    }
}
