package com.devlab.observer.example_feed;

import com.devlab.observer.example_feed.stuff.News;

public class ChannelFoo implements Channel{

    @Override
    public void update(News news) {
        System.out.println("FooChannel received news: " + news.getTitle());
    }
}
