package com.devlab.strategy.example_payment;

import com.devlab.strategy.example_payment.shopping.Cart;
import com.devlab.strategy.example_payment.shopping.Item;

public class Test {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Item item1 = new Item("1234",11);
        Item item2 = new Item("5678",33);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by credit card
        cart.pay(new CreditCardStrategy(
                "Ivan Ivanov",
                "3322167890123456",
                "455",
                "12/21"
        ));

        //pay by paypal
        cart.pay(new PaypalStrategy(
                "my@example.com",
                "123"
        ));

        //pay by revolut
        cart.pay(new RevolutStrategy(
                "my@example.com",
                "123"
        ));


    }
}
