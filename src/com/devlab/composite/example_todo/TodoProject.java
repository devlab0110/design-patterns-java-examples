package com.devlab.composite.example_todo;

import java.util.List;

public class TodoProject implements Todo {

    protected String text;
    protected List<Todo> todos;
    public TodoProject(String text, List<Todo> todos){
        this.text = text;
        this.todos = todos;
    }

    @Override
    public String buildHtml() {
        System.out.println("TodoProject : getHtml");
        String html = "";
        html += "<ul>";

            html += "<li>" + text + "</li>";

            if(todos.size() > 0){
                html += "<li>";
                    for(Todo todo : todos){
                        html += todo.buildHtml();
                    }
                html += "</li>";
            }

        html += "</ul>";
        return html;
    }



}
