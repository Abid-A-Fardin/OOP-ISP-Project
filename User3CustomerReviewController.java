package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class User3CustomerReviewController {

    @FXML
    private TableColumn<user3_customerReview, String> commentCol;

    @FXML
    private TableColumn<user3_customerReview, String> ratingCol;

    @FXML
    private TableColumn<user3_customerReview, String> reviewCustomerNameCol;

    @FXML
    private TableView<user3_customerReview> reviewTable;

    List<user3_customerReview> reviewList;

    @javafx.fxml.FXML
    public void initialize() {
        commentCol.setCellValueFactory(new PropertyValueFactory<>("comment"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        reviewCustomerNameCol.setCellValueFactory(new PropertyValueFactory<>("reviewerName"));

        reviewList= new ArrayList<>();
        reviewList.add(new user3_customerReview("Prionty", "Very fast and reliable Internet!", 5));
        reviewList.add(new user3_customerReview("Tanjim", "Good but bit expensive.", 4));
        reviewList.add(new user3_customerReview("Yasin", "Installation was late.", 2));

        for(user3_customerReview review: reviewList){
            reviewTable.getItems().add(review);
        }
    }
}