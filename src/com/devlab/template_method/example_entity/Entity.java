package com.devlab.template_method.example_entity;

public abstract class Entity {

    protected String tableName;
    public boolean save(){

        beforeSave();

        boolean status = true;
        // do
        // ....
        // ...
        // ..
        // .

        if(status){
            successSave();
        }
        else{
            failedSave();
        }

        return status;
    }

    public abstract void beforeSave();
    public abstract void successSave();
    public abstract void failedSave();

}
