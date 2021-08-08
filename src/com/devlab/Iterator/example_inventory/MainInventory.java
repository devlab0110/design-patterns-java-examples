package com.devlab.Iterator.example_inventory;

import com.devlab.Iterator.example_inventory.stuff.Item;

import java.util.List;

public class MainInventory implements Inventory {

    public List<Item> items;
    private boolean locked = false;
    public MainInventory(List<Item> items){
        this.items = items;
    }

    @Override
    public Iterator getIterathor() {
        if(locked){
            return new NullIterator();
        }
        else{
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
