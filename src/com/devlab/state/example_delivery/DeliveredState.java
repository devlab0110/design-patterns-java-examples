package com.devlab.state.example_delivery;

public class DeliveredState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void status() {
        System.out.println("DeliveredState : Package delivered to postman");
    }
}
