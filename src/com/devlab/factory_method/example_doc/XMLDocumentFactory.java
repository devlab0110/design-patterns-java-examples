package com.devlab.factory_method.example_doc;

public class XMLDocumentFactory extends DocumentFactory {
    @Override
    public Document createEmpty() {
        System.out.println("XMLDocumentFactory : createEmpty");
        return new XMLDocument();
    }

    @Override
    public Document createFromFilepath(String filepath) {
        System.out.println("XMLDocumentFactory : createFromFilepath");
        return new XMLDocument();
    }


}
