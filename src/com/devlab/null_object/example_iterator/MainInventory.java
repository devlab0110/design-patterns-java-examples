package com.devlab.null_object.example_iterator;

import com.devlab.null_object.example_iterator.stuff.Item;

import java.util.List;

public class MainInventory implements Inventory {

    public List<Item> items;
    private boolean locked = false;
    public MainInventory(List<Item> items){
        this.items = items;
    }

    @Override
    public Iterathor getIterathor() {
        if(locked){
            System.out.println("MainInventory : getIterathor <<< NullIterator");
            return new NullIterator();
        }
        else{
            System.out.println("MainInventory : getIterathor <<< MainInventoryIterator");
            return new MainInventoryIterator(this);
        }

    }

    public void lock(){
        locked = true;
    }

    public void unlock(){
        locked = true;
    }
}
