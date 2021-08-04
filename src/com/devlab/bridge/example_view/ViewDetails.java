package com.devlab.bridge.example_view;

import com.devlab.bridge.example_view.stuff.Artist;

public class ViewDetails extends View {


    public ViewDetails(Resource resource) {
        super(resource);
    }

    @Override
    public String getHtml() {

        System.out.println("------------------");
        System.out.println("View Details Bridge: ");

        String html = "";
        html += "<section>";

            System.out.print("resource.title <> ");
            html += "<h2>"+resourse.getTitle()+"</h2>";

            System.out.print("\nresource.image <> ");
            html += "<img src="+resourse.getImage()+">";

            System.out.print("\nresource.text <> ");
            html += "<p>"+resourse.getText()+"</p>";

            System.out.print("\n\n");

        html += "</section>";
        return html;
    }
}
