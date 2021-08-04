package com.devlab.null_object.example_router;




public class Test {

    public static void main(String[] args) {

        //....................
        System.out.println("------------------");
        Router router1 = Factory.create("sms");
        router1.route("foo/bar");

        Router router2 = Factory.create("jms");
        router2.route("foo/bar");

        Router router3 = Factory.create("rtf");
        router3.route("foo/bar");

    }

}
