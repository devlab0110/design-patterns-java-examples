package com.devlab.strategy.example_npc;

public class JumpBarStrategy implements JumpStrategy{

    @Override
    public void jump() {
        System.out.println("Jumping whit Bar!");
    }
}
