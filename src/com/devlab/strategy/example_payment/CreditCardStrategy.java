package com.devlab.strategy.example_payment;

public class CreditCardStrategy implements PaymentStrategy{

    private String names;
    private String cardNumber;
    private String cvv;
    private String dateOfExpire;

    public CreditCardStrategy(
            String names,
            String cardNumber,
            String cvv,
            String dateOfExpire
    ){
        this.names        = names;
        this.cardNumber   = cardNumber;
        this.cvv          = cvv;
        this.dateOfExpire = dateOfExpire;

    }

    @Override
    public void pay(int amount) {
        System.out.println(" CreditCardStrategy pay: " + amount);
    }
}
