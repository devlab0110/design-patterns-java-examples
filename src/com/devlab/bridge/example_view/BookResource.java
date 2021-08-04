package com.devlab.bridge.example_view;

import com.devlab.bridge.example_view.stuff.Book;

public class BookResource implements Resource {

    Book book;
    public BookResource(Book book){
        this.book = book;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getText() {
        return book.getDesc();
    }

    @Override
    public String getImage() {
        return book.getCover();
    }
}
