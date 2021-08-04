package com.devlab.null_object.example_router;

public class SmsRouter implements Router {

    @Override
    public void route(String path) {
        System.out.println("SmsRouter : route : "+path);
    }
}
