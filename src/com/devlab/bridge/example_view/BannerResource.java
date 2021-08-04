package com.devlab.bridge.example_view;

import com.devlab.bridge.example_view.Resource;
import com.devlab.bridge.example_view.stuff.Banner;

public class BannerResource implements Resource {

    Banner banner;
    public BannerResource(Banner banner){
        this.banner = banner;
    }

    @Override
    public String getTitle() {
        return banner.getTitle();
    }

    @Override
    public String getText() {
        return banner.getText();
    }

    @Override
    public String getImage() {
        return banner.getImage();
    }
}
