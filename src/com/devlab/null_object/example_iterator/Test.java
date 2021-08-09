package com.devlab.null_object.example_iterator;


import com.devlab.null_object.example_iterator.stuff.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //....................
        Item item1 = new ItemA();
        Item item2 = new ItemB();
        Item item3 = new ItemC();


        //....................
        System.out.println("\n------------------");
        System.out.println("MainInventory iterate:");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);


        MainInventory main = new MainInventory(items);
        Iterator iterathor2 = main.getIterathor();
        while (true){
            Item item = iterathor2.next();
            if(item == null){
                break;
            }
            System.out.println("Item : "+item.getClass().getSimpleName());
        }


        //....................
        System.out.println("\n------------------");
        System.out.println("MainInventory iterate LOCKED!!!:");
        main.lock();
        Iterator iterathor3 = main.getIterathor();
        while (true){
            Item item = iterathor3.next();
            if(item == null){
                break;
            }
            System.out.println("Item : "+item.getClass().getSimpleName());
        }



    }

}
