package com.example.finalproject;

import javafx.scene.control.Label;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class User3FaqController{
    @javafx.fxml.FXML
    private Label faqLabel; //n

    public void initialize() {

    }
    public void setFaqLabel(String text){
        faqLabel.setText(text);
    }
}