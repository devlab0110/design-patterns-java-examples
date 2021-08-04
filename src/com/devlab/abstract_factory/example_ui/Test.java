package com.devlab.abstract_factory.example_ui;



public class Test {

    public static void main(String[] args) {

        Factory factory = null;
        String os = "linux";

        if(os.equals("windows")){
            factory = new WindowsFactory();
        }
        else if(os.equals("linux")){
            factory = new LinuxFactory();
        }
        else if(os.equals("mac")){
            factory = new MacFactory();
        }

        if(factory != null){
            UIElement window  = factory.createWindow();
            UIElement button  = factory.createButton();
            UIElement alert   = factory.createAlert();
            UIElement confirm = factory.createConfirm();
            UIElement popup   = factory.createPopup();
        }
        else{
            System.out.println("Not supported os!");
        }




    }




}
