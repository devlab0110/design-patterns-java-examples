package com.devlab.state.example_delivery;

public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void status();

}


