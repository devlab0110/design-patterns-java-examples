package com.devlab.strategy.example_npc;

import com.devlab.strategy.example_npc.stuff.Target;
import com.devlab.strategy.example_npc.stuff.iTarget;

public class MoveBarStrategy implements MoveStrategy{

    @Override
    public void move(iTarget target) {
        System.out.println("Moving whit Bar!");
    }
}
