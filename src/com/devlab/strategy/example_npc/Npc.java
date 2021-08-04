package com.devlab.strategy.example_npc;

import com.devlab.strategy.example_npc.stuff.Target;
import com.devlab.strategy.example_npc.stuff.iTarget;

public class Npc {

    private MoveStrategy moving;
    private JumpStrategy jumping;
    private ShootStrategy shooting;

    public Npc(
            MoveStrategy moving,
            JumpStrategy jumping,
            ShootStrategy shooting
    ){
        this.moving = moving;
        this.jumping = jumping;
        this.shooting = shooting;
    }

    public void move(iTarget target){
        this.moving.move(target);
    }

    public void jump(){
        this.jumping.jump();
    }

    public void shoot(iTarget target){
        this.shooting.shoot(target);
    }

}
