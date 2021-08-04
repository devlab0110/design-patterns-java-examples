package com.devlab.null_object.example_router;

public class Factory {

    public static Router create(String name){
        if(name == "sms"){
            return new SmsRouter();
        }
        else if(name == "jms"){
            return new JmsRouter();
        }
        else{
            return new NullRouter();
        }
    }

}
