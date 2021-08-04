package com.devlab.factory_method.example_doc;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createEmpty() {
        System.out.println("PDFDocumentFactory : createEmpty");
        return new PDFDocument();
    }

    @Override
    public Document createFromFilepath(String filepath) {
        System.out.println("PDFDocumentFactory : createFromFilepath");
        return new PDFDocument();
    }


}
