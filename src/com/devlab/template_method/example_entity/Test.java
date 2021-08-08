package com.devlab.template_method.example_entity;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("UserEntity:");
        Entity user = new UserEntity();
        user.save();

        System.out.println("------------------");
        System.out.println("PostEntity:");
        Entity post = new PostEntity();
        post.save();

    }

}
