package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AdminDashboardController {

    @FXML
    private AnchorPane dashboardAnchorpane;
    @FXML
    private BorderPane adminDashboardBorderPane;

    @FXML
    void activeAreasButton(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User1_AdminAreaManagement.fxml"));

            Node loadedNode = fxmlLoader.load();
            System.out.println("Loaded node: " + loadedNode);
            adminDashboardBorderPane.setCenter(loadedNode);

            adminDashboardBorderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }

    @FXML
    void backButton(ActionEvent event) {

    }

    @FXML
    void createPlanButton(ActionEvent event) {

    }

    @FXML
    void downloadReportButton(ActionEvent event) {

    }

    @FXML
    void editClientDetailsButton(ActionEvent event) {

    }

    @FXML
    void seeAllCashInflowButton(ActionEvent event) {

    }

    @FXML
    void seeCorporateCustomerButton(ActionEvent event) {

    }

    @FXML
    void seeResidentialCustomerButton(ActionEvent event) {

    }

}
