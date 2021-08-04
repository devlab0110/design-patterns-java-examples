package com.devlab.proxy.example_cache;

public class ArticleAnalizatorCache implements ArticleAnalizator{


    private ArticleAnalizator analizator = null;
    private int numberOfWords = -1;
    private int numberOfChars = -1;

    public ArticleAnalizatorCache(Article article){
        analizator = new ArticleAnalizatorBase(article);
    }

    @Override
    public int numberOfWords() {
        System.out.println("ArticleAnalizatorCache : numberOfWords");
        if(numberOfWords < 0){
            numberOfWords = analizator.numberOfWords();
        }
        return numberOfWords;
    }

    @Override
    public int numberOfChars() {
        System.out.println("ArticleAnalizatorCache : numberOfChars");
        if(numberOfChars < 0){
            numberOfChars = analizator.numberOfChars();
        }
        return numberOfChars;
    }

}
