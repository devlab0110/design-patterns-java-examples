package com.devlab.template_method.example_network;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        Network network1 = new Facebook("foo", "bar");
        network1.post("message in Facebook");

        System.out.println("\n\n--------------------------------------------");
        Network network2 = new Twitter("foo", "bar");
        network2.post("message in Twitter");

    }
}
