package com.devlab.decorator.example_christmas_tree;



public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("tree1:");
        System.out.println("- ChristmasTreeImpl");
        System.out.println("- Garland");
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        String decorated1 = tree1.decorate();
        System.out.println(decorated1);


        System.out.println("------------------");
        System.out.println("tree2:");
        System.out.println("- ChristmasTreeImpl");
        System.out.println("- BubbleLights");
        System.out.println("- Tinsel");
        System.out.println("- Garland");
        ChristmasTree tree2 = new Garland(
          new Tinsel(
              new BubbleLights(
                  new ChristmasTreeImpl()
              )
          )
        );
        String decorated2 = tree2.decorate();
        System.out.println(decorated2);



    }

}
