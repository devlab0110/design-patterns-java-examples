package com.devlab.strategy.example_npc;


import com.devlab.strategy.example_npc.stuff.iTarget;

public interface MoveStrategy {
    public void move(iTarget target);
}
