package com.devlab.bridge.example_view;

public abstract class View {

    Resource resourse;

    public View(Resource resourse){
        this.resourse = resourse;
    }
    public abstract String getHtml();
}
