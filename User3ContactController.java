package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class User3ContactController {

    @FXML
    private Label getBackLabel;

    @FXML
    private ComboBox<String> issueComboBox;

    @FXML
    private TextArea issuefield;

    @FXML
    private TextField namefield;
    @FXML
    private TextField phoneNofield;


    @FXML
    public void initialize() {
        issueComboBox.getItems().addAll("Connection problem",
                "Billing issue", "Installation Help", "Other");
    }
    @FXML
    void submitOnAction(ActionEvent event) {
        String name = namefield.getText();
        String phoneNo = phoneNofield.getText();
        String issueType = issueComboBox.getValue();
        String issueDescription = issuefield.getText();

        if (name.isEmpty() || phoneNo.isEmpty() || phoneNo.length() < 11 || phoneNo.length() > 11 || issueType == null || issueDescription.isEmpty()) {
            getBackLabel.setText("Please check again and fill in all fields correctly.");
        }
        boolean digitFound = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                digitFound = true;
            }
            if (digitFound) {
                getBackLabel.setText("Please Enter a valid Name!");
            }

        }
        boolean alphaFound = true;
        for (int i = 0; i < phoneNo.length(); i++) {
            if (name.charAt(i) < '0' && name.charAt(i) > '9') {
                alphaFound = true;
            }
            if (alphaFound) {
                getBackLabel.setText("Please Enter a valid Phone Number!");
            }

            getBackLabel.setText("Your issue has been submitted.");
            namefield.clear();
            phoneNofield.clear();
            issuefield.clear();
            issueComboBox.getSelectionModel().clearSelection();
        }
    }
}