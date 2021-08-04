package com.devlab.strategy.example_payment;

public class PaypalStrategy implements PaymentStrategy{

    private String email;
    private String pass;


    public PaypalStrategy(
            String email,
            String pass
    ){
        this.email  = email;
        this.pass   = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println(" PaypalStrategy pay: " + amount);
    }
}
