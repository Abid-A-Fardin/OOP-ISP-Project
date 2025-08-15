package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class User4CostController {

    @FXML
    private ComboBox<String> planCB;

    @FXML
    private TextField promoForCost;

    @FXML
    private Label totalCostLabel;
    private ArrayList<promoCode> promoCodes= new ArrayList<>();
    private user4_cost cost;

@javafx.fxml.FXML
    public void initialize() {
    promoCodes.add(new promoCode("Student Saver", 20));
    promoCodes.add(new promoCode("Big Saver", 10));

    planCB.getItems().addAll("Basic","Standard", "Premium");
}

    @javafx.fxml.FXML
    public void calculateCostOnAction(ActionEvent actionEvent) {
    String plan= planCB.getValue();
    String promoCode = promoForCost.getText();
    double baseAmount =0.0;
    if(plan != null){
        if (plan == "Basic"){
        baseAmount = 800;
    }
        if (plan == "Standard"){
            baseAmount = 1200;
        }
        if (plan == "Premium"){
            baseAmount = 2500;
        }
    user4_cost cal = new user4_cost(promoCodes, baseAmount);
    cost.setPromoCode(promoCode);
    double totalCost = cal.totalCost();
    totalCostLabel.setText(String.format("total Cost : %.2f", totalCost));}
    totalCostLabel.setText("please select a plan");
}

    @javafx.fxml.FXML
    public void applyPromoOnAction(ActionEvent actionEvent) {
    String promoCode = promoForCost.getText();
    cost.setPromoCode(promoCode);

    double total = cost.totalCost();
    if(total == 800 || total == 1200 || total ==2500 && promoCode!=null){
        totalCostLabel.setText("Invalid promo code.");
    }
    }
}