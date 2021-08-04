package com.devlab.abstract_factory.example_ui;

import com.devlab.abstract_factory.example_ui.linux.*;

public class LinuxFactory extends Factory {


    @Override
    public UIElement createWindow() {
        System.out.println("Linux Window!");
        return new Window();
    }

    @Override
    public UIElement createButton() {
        System.out.println("Linux Button!");
        return new Button();
    }

    @Override
    public UIElement createAlert() {
        System.out.println("Linux Alert!");
        return new Alert();
    }

    @Override
    public UIElement createConfirm() {
        System.out.println("Linux Confirm!");
        return new Confirm();
    }

    @Override
    public UIElement createPopup() {
        System.out.println("Linux Popup!");
        return new Popup();
    }
}
