package com.devlab.abstract_factory.example_ui;

public abstract class Factory {

    public abstract UIElement createWindow();
    public abstract UIElement createButton();
    public abstract UIElement createAlert();
    public abstract UIElement createConfirm();
    public abstract UIElement createPopup();

}
