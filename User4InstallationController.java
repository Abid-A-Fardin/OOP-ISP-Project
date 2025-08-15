package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class User4InstallationController {

    @FXML
    private Label appointmentConfirmationLabel;

    @FXML
    private DatePicker appointmentDatePicker;

    @FXML
    private TextField customerIdField;
    ArrayList<user4_installation> d;


@javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void confirmAppointmentOnAction(ActionEvent actionEvent) {
        String customerId= customerIdField.getText();
        LocalDate selectedDate= appointmentDatePicker.getValue();

        if(customerId.isEmpty()){
            appointmentConfirmationLabel.setText("Please enter a customer Id!");
        }
        if(selectedDate.isBefore(LocalDate.now())|| selectedDate == null ){
            appointmentConfirmationLabel.setText("Please set an valid date.");
        }

        appointmentConfirmationLabel.setText("Installation for customer"+ customerId + "scheduled on" + selectedDate);
    }
}