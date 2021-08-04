package com.devlab.Iterator.example_inventory;

import com.devlab.Iterator.example_inventory.stuff.Item;

public class NullIterator implements Iterathor{
    @Override
    public Item next() {
        return null;
    }
}
