package com.devlab.state.example_delivery;




public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();



    }

}
