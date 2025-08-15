package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class User3InternetSpeedController {

    @FXML
    private Label downloadSpeedField;

    @FXML
    private Label pingField;

    @FXML
    private Label uploadSpeedField;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void speedTestOnAction(ActionEvent actionEvent) {
        Random random = new Random();
        double ping = 5+ random.nextInt(95);
        double download = 10 + random.nextDouble() * 90;
        double upload = 5 + random.nextDouble() * 45;

        downloadSpeedField.setText(String.format("%.2f", download));
        uploadSpeedField.setText(String.format("%.2f", upload));
        pingField.setText(String.format("%.2f",ping));
    }
}