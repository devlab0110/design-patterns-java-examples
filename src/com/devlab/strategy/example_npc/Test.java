package com.devlab.strategy.example_npc;


import com.devlab.strategy.example_npc.stuff.Target;

public class Test {

    public static void main(String[] args) {


        System.out.println("------------------");
        System.out.println("npcA whit:");
        System.out.println("- MoveFooStrategy");
        System.out.println("- JumpFooStrategy");
        System.out.println("- ShootRaaStrategy");
        Npc npcA = new Npc(
            new MoveFooStrategy(),
            new JumpFooStrategy(),
            new ShootRaaStrategy()
        );
        npcA.move(new Target(0.1, 0.2, 5.2));
        npcA.jump();
        npcA.shoot(new Target(0.3, 0.4, 5.2));


        System.out.println("------------------");
        System.out.println("npcB whit:");
        System.out.println("- MoveRaaStrategy");
        System.out.println("- JumpBarStrategy");
        System.out.println("- ShootFooStrategy");
        Npc npcB = new Npc(
                new MoveRaaStrategy(),
                new JumpBarStrategy(),
                new ShootFooStrategy()
        );
        npcB.move(new Target(0.1, 0.2, 5.2));
        npcB.jump();
        npcB.shoot(new Target(0.3, 0.4, 5.2));


    }
}
