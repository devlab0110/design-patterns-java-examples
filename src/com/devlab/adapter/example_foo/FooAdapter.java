package com.devlab.adapter.example_foo;

public class FooAdapter implements Adapter{

    private Foo foo;
    public FooAdapter(Foo foo){
        this.foo = foo;
    }

    @Override
    public void methodA() {
        System.out.println("FooAdapter : methodA : Foo : some");
        this.foo.some();
    }

    @Override
    public void methodB() {
        System.out.println("FooAdapter : methodB : Foo : tar");
        this.foo.tar();
    }

    @Override
    public void methodC() {
        System.out.println("FooAdapter : methodC : Foo : zen");
        this.foo.zen();
    }
}
