package com.devlab.null_object.example_router;

public class JmsRouter implements Router {

    @Override
    public void route(String path) {
        System.out.println("JmsRouter : route : "+path);
    }
}
