package com.devlab.bridge.example_view.stuff;

public class Banner {

    private String title;
    private String image;
    private String text;

    public Banner(String title, String image, String text){
        this.title = title;
        this.image = image;
        this.text  = text;
    }

    public String getTitle() {
        System.out.print("banner.title");
        return title;
    }

    public String getImage() {
        System.out.print("banner.image");
        return image;
    }

    public String getText() {
        System.out.print("banner.text");
        return text;
    }
}
