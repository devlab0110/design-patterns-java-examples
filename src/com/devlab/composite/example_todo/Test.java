package com.devlab.composite.example_todo;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        Todo todo1 = new TodoSingle("todo1");
        todo1.buildHtml();

        System.out.println("\n------------------");
        List<Todo> todos = new ArrayList<>();
        todos.add(new TodoSingle("todo2.1"));
        todos.add(new TodoSingle("todo2.2"));
        todos.add(new TodoSingle("todo2.3"));
        Todo todo2 = new TodoProject("todo2", todos);
        todo2.buildHtml();





    }

}
