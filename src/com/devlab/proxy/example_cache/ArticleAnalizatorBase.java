package com.devlab.proxy.example_cache;

public class ArticleAnalizatorBase implements ArticleAnalizator{

    private Article article;

    public ArticleAnalizatorBase(Article article){
        this.article = article;
    }

    @Override
    public int numberOfWords() {

        String text = article.getText();
        int count=0;

        char ch[]= new char[text.length()];
        for(int i=0;i<text.length();i++)
        {
            ch[i]= text.charAt(i);
            if( (
                    (i>0) && (ch[i]!=' ') && (ch[i-1]==' ')
            )
                    ||
                    (
                            (ch[0]!=' ') && (i==0)
                    )
            ){
                count++;
            }

        }
        return count;
    }

    @Override
    public int numberOfChars() {
        return article.getText().length();
    }
}
