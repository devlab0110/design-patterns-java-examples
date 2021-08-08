package com.devlab.composite.example_todo;

public class TodoSingle implements Todo {

    protected String text;
    public TodoSingle(String text){
        this.text = text;
    }

    @Override
    public String buildHtml() {
        System.out.println("TodoSingle : getHtml");
        String html = "";
        html += "<ul>";
            html += "<li>" + text + "</li>";
        html += "</ul>";
        return html;
    }

}
