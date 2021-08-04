package com.devlab.abstract_factory.example_ui;

import com.devlab.abstract_factory.example_ui.mac.*;

public class MacFactory extends Factory {


    @Override
    public UIElement createWindow() {
        System.out.println("Mac Window!");
        return new Window();
    }

    @Override
    public UIElement createButton() {
        System.out.println("Mac Button!");
        return new Button();
    }

    @Override
    public UIElement createAlert() {
        System.out.println("Mac Alert!");
        return new Alert();
    }

    @Override
    public UIElement createConfirm() {
        System.out.println("Mac Confirm!");
        return new Confirm();
    }

    @Override
    public UIElement createPopup() {
        System.out.println("Mac Popup!");
        return new Popup();
    }
}
