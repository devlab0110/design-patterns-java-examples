package com.devlab.bridge.example_view.stuff;

public class Book {

    private String title;
    private String cover;
    private String desc;

    public Book(String title, String cover, String desc){
        this.title = title;
        this.cover = cover;
        this.desc   = desc;
    }

    public String getTitle() {
        System.out.print("book.title");
        return title;
    }

    public String getCover() {
        System.out.print("book.cover");
        return cover;
    }

    public String getDesc() {
        System.out.print("book.desc");
        return desc;
    }
}
