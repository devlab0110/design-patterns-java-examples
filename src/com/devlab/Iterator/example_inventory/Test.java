package com.devlab.Iterator.example_inventory;


import com.devlab.Iterator.example_inventory.stuff.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //....................
        Item item1 = new ItemA();
        Item item2 = new ItemB();
        Item item3 = new ItemC();
        Item item4 = new ItemD();
        Item item5 = new ItemE();

        //....................
        System.out.println("\n------------------");
        System.out.println("HandsInventory iterate:");
        Inventory hands = new HandsInventory(item1, item2);
        Iterathor iterathor = hands.getIterathor();
        while (true){
            Item item = iterathor.next();
            if(item == null){
                break;
            }
            System.out.println("Item : "+item.getClass().getSimpleName());
        }


        //....................
        System.out.println("\n------------------");
        System.out.println("MainInventory iterate:");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        MainInventory main = new MainInventory(items);
        Iterathor iterathor2 = main.getIterathor();
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
        Iterathor iterathor3 = main.getIterathor();
        while (true){
            Item item = iterathor3.next();
            if(item == null){
                break;
            }
            System.out.println("Item : "+item.getClass().getSimpleName());
        }



    }

}
