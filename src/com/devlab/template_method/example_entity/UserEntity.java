package com.devlab.template_method.example_entity;

public class UserEntity extends Entity{

    public UserEntity(){
        this.tableName = "user";
    }

    @Override
    public void beforeSave() {
        System.out.println("UserEntity : beforeSave");
    }

    @Override
    public void successSave() {
        System.out.println("UserEntity : successSave");
    }

    @Override
    public void failedSave() {
        System.out.println("UserEntity : failedSave");
    }
}
