package com.devlab.Iterator.example_inventory;


import com.devlab.Iterator.example_inventory.stuff.Item;

public class MainInventoryIterator implements Iterator {

    private MainInventory mainInventory;
    private int max = 0;
    private int index = 0;
    public MainInventoryIterator(MainInventory mainInventory){
        this.mainInventory = mainInventory;
        this.max = mainInventory.items.size()-1;
    }


    @Override
    public Item next() {
        if(index > max){
            return null;
        }
        Item item = mainInventory.items.get(index);
        index++;
        return item;
    }
}
