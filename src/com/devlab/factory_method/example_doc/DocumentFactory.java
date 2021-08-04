package com.devlab.factory_method.example_doc;

public abstract class DocumentFactory {

    public abstract Document createEmpty();
    public abstract Document createFromFilepath(String filepath);

}
