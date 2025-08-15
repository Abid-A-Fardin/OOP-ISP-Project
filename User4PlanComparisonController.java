package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class User4PlanComparisonController {

    @FXML
    private ComboBox<String> firstPlanCB;

    @FXML
    private Label firstPlanFeatureLabel;

    @FXML
    private Label firstPlanLabel;

    @FXML
    private Label firstPlanPriceLabel;

    @FXML
    private Label firstPlanSpeedLabel;

    @FXML
    private ComboBox<String> secondPlanCB;

    @FXML
    private Label secondPlanFeatureLabel;

    @FXML
    private Label secondPlanLabel;

    @FXML
    private Label secondPlanPriceLabel;

    @FXML
    private Label secondPlanSpeedLabel;


@javafx.fxml.FXML
    public void initialize() {
    firstPlanCB.getItems().addAll("Basic", "Standard", "Premium");
    secondPlanCB.getItems().addAll("Basic", "Standard", "Premium");
    }
}