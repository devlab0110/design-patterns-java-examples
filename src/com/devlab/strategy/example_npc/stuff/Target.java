package com.devlab.strategy.example_npc.stuff;

public class Target implements iTarget{

    private Double x;
    private Double y;
    private Double z;

    public Target(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public Double getX() {
        return this.x;
    }

    @Override
    public Double getY() {
        return this.y;
    }

    @Override
    public Double getZ() {
        return this.z;
    }
}
