package com.devlab.null_object.example_iterator;

import com.devlab.null_object.example_iterator.stuff.Item;

public class NullIterator implements Iterator {
    @Override
    public Item next() {
        return null;
    }
}
