package com.devlab.bridge.example_view;


import com.devlab.bridge.example_view.stuff.Album;
import com.devlab.bridge.example_view.stuff.Artist;
import com.devlab.bridge.example_view.stuff.Banner;
import com.devlab.bridge.example_view.stuff.Book;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String html = "";


        // prepare entities ...
        Artist artist = new Artist("Eminnem", "1.jpg", "Eminnem is ...");
        Book   book   = new Book("A Little Life", "2.jpg", "The book is ...");
        Album  album  = new Album("HAPPIER THAN EVER", "43.jpg", "New Billie Eilish album is ...");
        Banner banner = new Banner("Coca Cola", "32.jpg", "");


        // prepare resources ...
        ArtistResource artistR = new ArtistResource(artist);
        BookResource   bookR   = new BookResource(book);
        AlbumResource  albumR  = new AlbumResource(album);
        BannerResource bannerR = new BannerResource(banner);


        // html ViewDetails ...
        View details = new ViewDetails(artistR);
        html += details.getHtml();



        // loop html ViewListItem ...
        List<Resource> resources = new ArrayList<>();
        resources.add(artistR);
        resources.add(bookR);
        resources.add(albumR);
        resources.add(bannerR);
        for(Resource resource : resources){
            View item = new ViewListItem(resource);
            html += item.getHtml();
        }



        // html ....
        System.out.println("------------------");
        System.out.println("html");
        System.out.println(html);
    }

}
