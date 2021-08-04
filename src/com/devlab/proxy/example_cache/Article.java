package com.devlab.proxy.example_cache;

public class Article {

    private String title;
    private String text;

    public Article(String title, String text){
        this.title = title;
        this.text  = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
