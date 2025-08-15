package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class CorporateAddRemoveOfficeController {
    @javafx.fxml.FXML
    private AnchorPane corporateAddRemoveOfficeAnchorPane;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateAddRemoveDivisionColumn;
    @javafx.fxml.FXML
    private ComboBox<String> corporateAddRemoveDivisionComboBox;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateAddRemoveAreaColumn;
    @javafx.fxml.FXML
    private TableView<AllCustomers> corporateOfficeInfoTableView;
    @javafx.fxml.FXML
    private TextField corporateAddRemoveHouseNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> corporateAddRemoveAreaComboBox;
    @javafx.fxml.FXML
    private TextField corporateAddRemoveRoadNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateAddRemoveHouseNumberColumn;
    @javafx.fxml.FXML
    private TableColumn<AllCustomers, String> corporateAddRemoveRoadNumberColumn;


    FileHandlerUtil<AllCustomers> fileH;
    ArrayList<AllCustomers> corpC;
    @FXML
    void initialize(){
        corporateAddRemoveHouseNumberColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("corpHouseNumber"));
        corporateAddRemoveRoadNumberColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("corpRoadNumber"));
        corporateAddRemoveAreaColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("corpArea"));
        corporateAddRemoveDivisionColumn.setCellValueFactory(new PropertyValueFactory<AllCustomers, String>("corpDivision"));
        fileH = new FileHandlerUtil<>();
        corpC = new ArrayList<>(fileH.readFromFile("CorporateCustomer.bin"));
    }

    @javafx.fxml.FXML
    public void corporateAddRemoveRemoveOfficeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void corporateAddRemoveShowOfficesButton(ActionEvent actionEvent) {
        File f = new File("AllCustomers.bin");
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                corporateOfficeInfoTableView.getItems().add((AllCustomers) ois.readObject());
            }
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void corporateAddRemoveAddOfficeButton(ActionEvent actionEvent) {
       /* File f = new File("CourseInfo.bin");
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

            //for(# c: #){  // did not finish as i was focusing on showing variety.
              //  oos.writeObject(c);
            }
            //oos.close();
        }
        catch (IOException e){
            //
        }*/
    }
}
