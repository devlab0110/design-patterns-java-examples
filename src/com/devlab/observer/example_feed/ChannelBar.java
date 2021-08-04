package com.devlab.observer.example_feed;

import com.devlab.observer.example_feed.stuff.News;

public class ChannelBar implements Channel{

    @Override
    public void update(News news) {
        System.out.println("BarChannel received news: " + news.getTitle());
    }
}
