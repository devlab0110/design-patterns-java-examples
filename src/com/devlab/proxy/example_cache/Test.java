package com.devlab.proxy.example_cache;


public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        Article article = new Article(
                "What is Lorem Ipsum?",
                "Lorem Ipsum is simply " +
                        "dummy text of the printing " +
                        "and typesetting industry." +
                        " Lorem Ipsum has been the " +
                        "industry's standard dummy " +
                        "text ever since the 1500s, " +
                        "when an unknown printer " +
                        "took a galley of type and " +
                        "scrambled it to make a " +
                        "type specimen book. It has" +
                        " survived not only five centuries"
        );


        ArticleAnalizator proxy = new ArticleAnalizatorCache(article);
        int words_count = proxy.numberOfWords();
        int chars_count = proxy.numberOfChars();


        System.out.printf("numberOfWords: %d%n", words_count);
        System.out.printf("numberOfWords: %d%n", chars_count);




    }

}
