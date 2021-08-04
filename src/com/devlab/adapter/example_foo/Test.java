package com.devlab.adapter.example_foo;

public class Test {

    public static void main(String[] args) {

        String use = "foo";
        Adapter adapter = null;

        if(use.equals("foo")){
            adapter = new FooAdapter(new Foo());
        }
        else if(use.equals("bar")){
            adapter = new BarAdapter(new Bar());
        }


        if(adapter == null){
            System.out.println("Not supported library");
            return;
        }

        System.out.println("------------------");
        adapter.methodA();
        adapter.methodB();
        adapter.methodC();


    }

}
