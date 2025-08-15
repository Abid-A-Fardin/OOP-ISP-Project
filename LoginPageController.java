package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;


public class LoginPageController {
    FileHandlerUtil<AllCustomers> FileH;
    ArrayList<AllCustomers> AllCorps;


    @FXML
    private PasswordField loginPasswordPasswordField;

    @FXML
    private TextField loginUsernameTextField;

    @FXML
    void initialize(){
        FileH = new FileHandlerUtil<>();
        AllCorps = new ArrayList<>(FileH.readFromFile("CorporateCustomer.bin"));

    }

    @FXML
    void loginButton(ActionEvent event) {
            boolean isAdmin = false;
            boolean isCorporate = false;
            for (AllCustomers C : AllCorps) {
                if (C.getUserID().equals(loginUsernameTextField.getText()) && C.getUserPassword().equals(loginPasswordPasswordField.getText())) {
                    isCorporate = true;
                    break;
                }
            }
            if (loginUsernameTextField.getText().equals("123") && loginPasswordPasswordField.getText().equals("321")) {
                isAdmin = true;
            }

            if (isAdmin) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User1_AdminDashboard.fxml"));
                    Scene nextScene = new Scene(fxmlLoader.load());
                    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    currentStage.setScene(nextScene);
                    currentStage.setTitle("Admin Dashboard");
                    currentStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                    // Optionally show alert
                }
            } else if (isCorporate) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User2_CorporateCustomerDashboard.fxml"));
                    Scene nextScene = new Scene(fxmlLoader.load());
                    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    currentStage.setScene(nextScene);
                    currentStage.setTitle("Corporate Customer Dashboard");
                    currentStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                    // Optionally show alert
                }
            } else {
                Alert A = new Alert(Alert.AlertType.ERROR);
                A.setContentText("Error Logging In");
                A.show();
            }

            loginPasswordPasswordField.clear();
            loginUsernameTextField.clear();
        }
}

