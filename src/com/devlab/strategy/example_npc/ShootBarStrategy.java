package com.devlab.strategy.example_npc;

import com.devlab.strategy.example_npc.stuff.Target;
import com.devlab.strategy.example_npc.stuff.iTarget;

public class ShootBarStrategy implements ShootStrategy{

    @Override
    public void shoot(iTarget target) {
        System.out.println("Shooting whit Bar!");
    }
}
