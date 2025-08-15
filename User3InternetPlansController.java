package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class User3InternetPlansController {

    @FXML
    private TableColumn<user3_internetPlans, String> internetPlanCol;

    @FXML
    private TableColumn<user3_internetPlans, Boolean> routerCol;

    @FXML
    private TableColumn<user3_internetPlans, Boolean> installationCol;

    @FXML
    private TableView<user3_internetPlans> internetTableView;

    @FXML
    private TableColumn<user3_internetPlans, Double> priceCol;

    @FXML
    private Label planlabel;

    @FXML
    private TableColumn<user3_internetPlans, String> speedCol;
    ArrayList<user3_internetPlans> planlist = new ArrayList<>();

@javafx.fxml.FXML
    public void initialize() {
    internetPlanCol.setCellValueFactory(new PropertyValueFactory<>("planName"));
    speedCol.setCellValueFactory(new PropertyValueFactory<>("speedMbps"));
    priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    routerCol.setCellValueFactory(new PropertyValueFactory<>("hasRouter"));
    installationCol.setCellValueFactory(new PropertyValueFactory<>("hasInstallationFee"));

    planlist.add(new user3_internetPlans("Basic",20.00,800.00,true,false));
    planlist.add(new user3_internetPlans("Standard",30.00,1200.00,true,true));
    planlist.add(new user3_internetPlans("Semi-premium",50.00,1800.00,false,false));
    planlist.add(new user3_internetPlans("Premium",100.00,2500.00,true,true));

    //or( user3_internetPlans plans: planlist){
        //internetTableView.getItems().add(plans);}
    }

    @javafx.fxml.FXML
    public void selectPlanOnAction(ActionEvent actionEvent) {
    planlabel.setText("To select this plan, please register as a customer." +
            " Thank you!!!");
    }

    @FXML
    public void loadPlansFromBinOnAction(ActionEvent actionEvent) {
        FileInputStream fis= null;
        ObjectInputStream ois = null;
        try{
            File ff = new File("internetPlan.bin");
            if(ff.exists()){
                fis = new FileInputStream(ff);
            }
            else {
            }

            if(fis!=null) {
                ois = new ObjectInputStream(fis);
            }
            internetTableView.getItems().clear();
            while (true) {
                internetTableView.getItems().add((user3_internetPlans)ois.readObject());
            }

        }
        catch(Exception ee) {
            if(ois!=null){
                try {
                    ois.close();
                } catch (Exception e) {
               }
            }
        }
        System.out.println("hi");
   }
}