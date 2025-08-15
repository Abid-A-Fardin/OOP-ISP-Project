package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class SignUpPageController {

    @FXML
    private TextField signupCVCTextField;

    @FXML
    private TextField signupClientCardNumberTextFIeld;

    @FXML
    private DatePicker signupClientDatePicker;

    @FXML
    private ComboBox<String> signupClientTypeComboBox;

    @FXML
    private ComboBox<String> singupAreaComboBox;

    @FXML
    private TextField singupClientIdTextFIeld;

    @FXML
    private TextField singupCreatePasswordTextField;

    @FXML
    private ComboBox<String> singupDivisonComboBox;

    @FXML
    private TextField singupHouseNumberTextField;

    @FXML
    private TextField singupRoadNumberTextField;


    FileHandlerUtil<AllCustomers> corpC;
    ArrayList<AllCustomers> CorpList;
    @FXML
    void initialize(){
        signupClientTypeComboBox.getItems().addAll("Corporate", "Residential");
        singupAreaComboBox.getItems().addAll("Dhanmondi", "Gulshan");
        singupDivisonComboBox.getItems().addAll("Dhaka");
        corpC = new FileHandlerUtil<>();
        CorpList = new ArrayList<>(corpC.readFromFile("CorporateCustomer.bin"));


    }

    @FXML
    void singupButton(ActionEvent event) {
        boolean validated = false;
        if (
                        singupCreatePasswordTextField.getText().length() >= 5 &&
                        singupHouseNumberTextField.getText().length() <= 3 &&
                        singupRoadNumberTextField.getText().length() <= 3  &&
                        signupClientCardNumberTextFIeld.getText().matches("\\d{4}") &&
                        signupCVCTextField.getText().matches("\\d{3}") &&
                        signupClientDatePicker.getValue().isAfter(LocalDate.now())
        ) {
            validated = true;
        }

        boolean duplicateFound  = false;
        for(AllCustomers Corp: CorpList){
            if(Corp.getUserID().equals( singupClientIdTextFIeld.getText())) {
                duplicateFound = true;
            }

        }
        if(validated && !duplicateFound) {
            Random r = new Random();
            String generatedId = String.format("%04d", r.nextInt(1000));
            singupClientIdTextFIeld.setText(generatedId);
            AllCustomers C = new AllCustomers(singupClientIdTextFIeld.getText(), singupCreatePasswordTextField.getText(), signupClientTypeComboBox.getValue(), singupDivisonComboBox.getValue(), singupAreaComboBox.getValue(), singupHouseNumberTextField.getText(), singupRoadNumberTextField.getText(), signupClientCardNumberTextFIeld.getText(), signupCVCTextField.getText(), signupClientDatePicker.getValue());
            CorpList.add(C);
            //corpC.addToFile(C, "AllCustomers.bin");
            //Alert A = new Alert(Alert.AlertType.INFORMATION);
            //A.setContentText("Added Succesfully");
            //A.show();

            File f = new File("AllCustomers.bin");
            try{
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
                if(f.exists()){
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }

                for(AllCustomers c: CorpList){
                    oos.writeObject(c);
                }
                oos.close();
            }
            catch (IOException e) {
                throw new RuntimeException("Custom error message", e); //Custom exception
            }

        }
        else{
                Alert B = new Alert(Alert.AlertType.ERROR);
                B.setContentText("Error. Retry");
                B.show();

            }
        signupCVCTextField.clear();
        signupClientCardNumberTextFIeld.clear();
        singupRoadNumberTextField.clear();
        singupCreatePasswordTextField.clear();
        singupHouseNumberTextField.clear();
        singupClientIdTextFIeld.clear();

        }

}



