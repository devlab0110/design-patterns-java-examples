package com.devlab.abstract_factory.example_ui;

import com.devlab.abstract_factory.example_ui.windows.*;

public class WindowsFactory extends Factory {


    @Override
    public UIElement createWindow() {
        System.out.println("Windows Window!");
        return new Window();
    }

    @Override
    public UIElement createButton() {
        System.out.println("Windows Button!");
        return new Button();
    }

    @Override
    public UIElement createAlert() {
        System.out.println("Windows Alert!");
        return new Alert();
    }

    @Override
    public UIElement createConfirm() {
        System.out.println("Windows Confirm!");
        return new Confirm();
    }

    @Override
    public UIElement createPopup() {
        System.out.println("Windows Popup!");
        return new Popup();
    }
}
