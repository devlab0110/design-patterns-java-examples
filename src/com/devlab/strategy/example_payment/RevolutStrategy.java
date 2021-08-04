package com.devlab.strategy.example_payment;

public class RevolutStrategy  implements PaymentStrategy{

    private String email;
    private String pass;


    public RevolutStrategy(
            String email,
            String pass
    ){
        this.email  = email;
        this.pass   = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println(" RevolutStrategy pay: " + amount);
    }
}
