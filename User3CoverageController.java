package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class User3CoverageController {

    @FXML
    private TextField areaOfCheckingField;

    @FXML
    private Label internetCoveragelabel;

    private final List<String> coveredAreas = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        coveredAreas.addAll(List.of("uttara", "dhanmondi", "mirpur", "gulshan", "mohakhali", "banani"));

    }
    @FXML
    public void checkCoverageOnAction(ActionEvent event) {
        if(areaOfCheckingField.getText().isEmpty()){
            internetCoveragelabel.setText("Please enter an Area!");
        }
        else if(coveredAreas.contains(areaOfCheckingField.getText().toLowerCase())){
            internetCoveragelabel.setText("Internet coverage is available in "+areaOfCheckingField.getText()+".");
        }
        else{
            internetCoveragelabel.setText("Sorry, service is not available.");
        }

    }
}