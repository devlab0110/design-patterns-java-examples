package com.devlab.observer.example_feed;

import com.devlab.observer.example_feed.stuff.News;

public class Test {

    public static void main(String[] args) {

        //...........................
        Feed feed = new Feed();

        //...........................
        Channel channel1 = new ChannelFoo();
        feed.addObserver(channel1);

        Channel channel2 = new ChannelBar();
        feed.addObserver(channel2);

        //...........................
        News news1 = new News(
                "Brexit rancour and Boris Johnson",
                "We need permission from France, Germany et al to rejoin an ...",
                ""
        );
        feed.setNews(news1);

        News news2 = new News(
                "From cycling through woods to ...",
                "Olympic hero Tom Pidcock who won gold in the men’s cross country mountain biking in Tokyo learned ...",
                ""
        );
        feed.setNews(news2);


    }

}
