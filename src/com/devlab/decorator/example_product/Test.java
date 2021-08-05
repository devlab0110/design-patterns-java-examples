package com.devlab.decorator.example_product;



public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("productCafe:");
        iProduct productCafe = new Product(
                "Cafe" ,
                "Cafe desc" ,
                10
        );
        System.out.println("name: "+productCafe.getName());
        System.out.println("desc: "+productCafe.getDesc());
        System.out.println("price: "+productCafe.getPrice());
        System.out.println("");


        System.out.println("------------------");
        System.out.println("productDecoratedA:");
        System.out.println("- productCafe");
        System.out.println("- DecoratorFoo");
        System.out.println("- DecoratorRaa");
        iProduct productDecoratedA = new DecoratorRaa(
                new DecoratorFoo(
                        productCafe
                )
        );
        System.out.println("name: "+productDecoratedA.getName());
        System.out.println("desc: "+productDecoratedA.getDesc());
        System.out.println("price: "+productDecoratedA.getPrice());
        System.out.println("");


        System.out.println("------------------");
        System.out.println("productDecoratedB:");
        System.out.println("- productCafe");
        System.out.println("- DecoratorRaa");
        System.out.println("- DecoratorBar");
        System.out.println("- DecoratorFoo");
        iProduct productDecoratedB = new DecoratorFoo(
                new DecoratorBar(
                        new DecoratorRaa(
                                productCafe
                        )
                )
        );
        System.out.println("name: "+productDecoratedB.getName());
        System.out.println("desc: "+productDecoratedB.getDesc());
        System.out.println("price: "+productDecoratedB.getPrice());
        System.out.println("");


    }

}
