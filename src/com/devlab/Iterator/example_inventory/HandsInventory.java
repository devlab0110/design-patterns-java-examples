package com.devlab.Iterator.example_inventory;

import com.devlab.Iterator.example_inventory.stuff.Item;

public class HandsInventory implements Inventory {

    public Item left;
    public Item right;

    public HandsInventory(Item left, Item right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Iterator getIterathor() {
        return new HandsInventoryIterator(this);
    }
}
