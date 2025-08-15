package com.example.finalproject;

import javafx.scene.control.Label;

public class User3SetupController
{
    @javafx.fxml.FXML
    private Label installationLabel; //Everything is pre-written.
    @javafx.fxml.FXML
    public void initialize() {
    }
    public void setInstallationLabel(String tex){
        installationLabel.setText(tex);
    }

}