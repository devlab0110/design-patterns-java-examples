package com.devlab.adapter.example_foo;

public class BarAdapter implements Adapter{

    private Bar bar;
    public BarAdapter(Bar bar){
        this.bar = bar;
    }

    @Override
    public void methodA() {
        System.out.println("BarAdapter : methodC : Bar : tft");
        this.bar.tft();
    }

    @Override
    public void methodB() {
        System.out.println("BarAdapter : methodC : Bar : rar");
        this.bar.rar();
    }

    @Override
    public void methodC() {
        System.out.println("BarAdapter : methodC : Bar : saas");
        this.bar.saas();
    }
}
