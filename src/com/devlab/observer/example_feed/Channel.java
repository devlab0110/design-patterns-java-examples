package com.devlab.observer.example_feed;

import com.devlab.observer.example_feed.stuff.News;

public interface Channel {
    public void update(News news);
}
