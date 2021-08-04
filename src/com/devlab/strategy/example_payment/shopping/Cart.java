package com.devlab.strategy.example_payment.shopping;

import com.devlab.strategy.example_payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //List of items
    List<Item> items;

    public Cart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
