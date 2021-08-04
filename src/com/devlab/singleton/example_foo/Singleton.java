package com.devlab.singleton.example_foo;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Im Singleton contructor!");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
