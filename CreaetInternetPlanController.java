package com.example.oopispproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CreaetInternetPlanController {

    @FXML
    private TextField createPlanIdTextField;

    @FXML
    private TextField createPlanPriceTextField;

    @FXML
    private ComboBox<String> planAreaComboBox;

    @FXML
    private ComboBox<String> planDivisonComboBox;

    @FXML
    private ComboBox<String> planTypeComboBox;

    @FXML
    private Label showPlanAddedLabel;

    @FXML
    private Label showSuccessMessageLabel;
    ArrayList<InternetPlan> internetP;
    @FXML
    void initialize(){
        planAreaComboBox.getItems().addAll("Dhanmondi", "Gulshan");
        planDivisonComboBox.getItems().addAll("Dhaka");
        planTypeComboBox.getItems().addAll("Residential", "Corporate");
        internetP = new ArrayList<>();

    }
    @javafx.fxml.FXML
    public void addPlanButton(ActionEvent actionEvent) {
        // Not adding validation or verification as I've shown it before
        Random r = new Random();
        String generatedId = String.format("%04d", r.nextInt(1000));
        createPlanIdTextField.setText(generatedId);

        InternetPlan P = new InternetPlan(createPlanIdTextField.getText(),
                planTypeComboBox.getValue(),
                planDivisonComboBox.getValue(),
                planAreaComboBox.getValue(),
                createPlanPriceTextField.getText());

        internetP.add(P);
        showSuccessMessageLabel.setText("Added Successfully");


        try{
            File f = new File("InternetPlan.txt");
            FileWriter fw = null;
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str="";
            for(InternetPlan c: internetP){
                str+= c.toString();
            }
            fw.write(str);
            fw.close();
        }
        catch(IOException e){
            //
        }

        try{
            File f = new File("InternetPlan.txt");
            Scanner sc = new Scanner(f);
            String str = "";
            String[] tokens;
            while(sc.hasNextLine()){
                str = sc.nextLine();
                tokens = str.split(",");
                InternetPlan c = new InternetPlan(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
                showPlanAddedLabel.setText(c.toString());
            }
        }
        catch(IOException e){
            //
        }
    }

}
