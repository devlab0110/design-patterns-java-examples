package com.devlab.null_object.example_router;

public class NullRouter implements Router {

    @Override
    public void route(String path) {
        System.out.println("NullRouter : route : empty implementation!!!");
    }
}
