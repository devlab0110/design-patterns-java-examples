package com.devlab.template_method.example_entity;

public class PostEntity extends Entity{

    public PostEntity(){
        this.tableName = "user";
    }

    @Override
    public void beforeSave() {
        System.out.println("PostEntity : beforeSave");
    }

    @Override
    public void successSave() {
        System.out.println("PostEntity : successSave");
    }

    @Override
    public void failedSave() {
        System.out.println("PostEntity : failedSave");
    }
}
