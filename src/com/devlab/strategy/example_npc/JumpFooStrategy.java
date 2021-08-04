package com.devlab.strategy.example_npc;

public class JumpFooStrategy implements JumpStrategy{

    @Override
    public void jump() {
        System.out.println("Jumping whit Foo!");
    }
}
