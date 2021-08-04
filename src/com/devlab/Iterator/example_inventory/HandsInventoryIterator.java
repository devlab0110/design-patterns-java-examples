package com.devlab.Iterator.example_inventory;


import com.devlab.Iterator.example_inventory.stuff.Item;

public class HandsInventoryIterator implements Iterathor {

    private HandsInventory handsInventory;
    private int index = 0;
    public HandsInventoryIterator(HandsInventory handsInventory){
        this.handsInventory = handsInventory;
    }


    @Override
    public Item next() {
        if(index == 0){
            index++;
            return handsInventory.left;
        }
        else if(index == 1){
            index++;
            return handsInventory.right;
        }
        else{
            return null;
        }
    }
}
