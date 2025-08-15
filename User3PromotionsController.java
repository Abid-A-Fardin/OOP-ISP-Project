package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class User3PromotionsController {

    @FXML
    private TableColumn<user3_promotions, String> PromoNameCol;

    @FXML
    private TableColumn<user3_promotions, String> promoDescriptionCol;

    @FXML
    private TableView<user3_promotions> promoTable;

    @FXML
    private TableColumn<user3_promotions, LocalDate> promoValidityCol;
    ArrayList <user3_promotions> promotionlist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        PromoNameCol.setCellValueFactory(new PropertyValueFactory<>("PromoCode"));
        promoDescriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        promoValidityCol.setCellValueFactory(new PropertyValueFactory<>("validity"));

        promotionlist.add(new user3_promotions("Student Saver", "20% discount for students", LocalDate.of(2025,12,20)));
        promotionlist.add(new user3_promotions("Big Saver", "10% discount for 3 months", LocalDate.of(2025,11,30)));
        promotionlist.add(new user3_promotions("New10", "10% discount for the first month", LocalDate.of(2025,9,30)));

        //for (user3_promotions promo : promotionlist){
            //promoTable.getItems().add(promo);
       // }
    }

    @FXML
    public void loadPromotionsOnAction(ActionEvent actionEvent){
        File fi = new File("promotions.bin");
        FileInputStream fiss=null;
        ObjectInputStream oiss = null;
        try{
            if(fi.exists()){
                fiss= new FileInputStream(fi);
            }
            else{}
            if(fiss!= null){
                oiss = new ObjectInputStream(fiss);
            }
            promoTable.getItems().clear();
            while(true){
                promoTable.getItems().add((user3_promotions)oiss.readObject());
                System.out.println("loaded" );
            }
        }
        catch (Exception e) {
            if(oiss!=null) {
                try {
                    oiss.close();
                } catch (Exception ex) {

                }
            }
        }
    }
}