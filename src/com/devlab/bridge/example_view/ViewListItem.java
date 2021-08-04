package com.devlab.bridge.example_view;

public class ViewListItem extends View {

    public ViewListItem(Resource resource) {
        super(resource);
    }

    @Override
    public String getHtml() {

        System.out.println("------------------");
        System.out.println("View List Item Bridge: ");

        String html = "";
        html += "<div>";

            System.out.print("resource.image <> ");
            html += "<img src="+resourse.getImage()+">";

            System.out.print("\nresource.title <> ");
            html += "<h2>"+resourse.getTitle()+"</h2>";

            System.out.print("\n\n");

        html += "</div>";
        return html;
    }
}
