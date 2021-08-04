package com.devlab.observer.example_feed.stuff;

public class News {

    private String title;
    private String text;
    private String imageUrl;

    public News(
            String title,
            String text,
            String imageUrl
    ){
        this.title = title;
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
