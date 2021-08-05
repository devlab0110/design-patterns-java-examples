package com.devlab.factory_method.example_doc;

public class CSVDocumentFactory extends DocumentFactory {
    @Override
    public Document createEmpty() {
        System.out.println("CSVDocumentFactory : createEmpty");
        return new CSVDocument();
    }

    @Override
    public Document createFromFilepath(String filepath) {
        System.out.println("CSVDocumentFactory : createFromFilepath");
        return new CSVDocument();
    }

}
