package com.devlab.factory_method.example_doc;



public class Test {

    public static void main(String[] args) {

        DocumentFactory factory1 = new PDFDocumentFactory();
        Document docEmpty = factory1.createEmpty();

        DocumentFactory factory2 = new PDFDocumentFactory();
        Document doc = factory2.createFromFilepath("/foo/bar.pdf");

    }




}
