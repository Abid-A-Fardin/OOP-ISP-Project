package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class AdminCorporateClientCountController {
    @javafx.fxml.FXML
    private TextField showCountofTotalCorporateClientTextField;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateClientIdColumn;
    @javafx.fxml.FXML
    private TableView<AllCustomers> corporateClientDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateInternetPlanIdColumn;

    FileHandlerUtil<AllCustomers> fileH;
    ArrayList<AllCustomers> arr;


    @FXML
    void initialize(){
        fileH = new FileHandlerUtil<>();
        arr = new ArrayList<>(fileH.readFromFile("CorporateCustomer.bin"));
        corporateClientIdColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("userID"));
        corporateInternetPlanIdColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("planID"));

    }

    @javafx.fxml.FXML
    public void showTotalNumberOfCorporateClientsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showCorporateClientinTableButton(ActionEvent actionEvent) {
        boolean isEmpty = false;
        for(AllCustomers C: arr){

        }


    }
}
