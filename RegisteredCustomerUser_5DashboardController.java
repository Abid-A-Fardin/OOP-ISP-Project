package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class RegisteredCustomerUser_5DashboardController {
    @javafx.fxml.FXML
    private BorderPane dashboardBorderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payBillButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_PayBill.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }


    @javafx.fxml.FXML
    public void checkDataUsageButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_CheckDataUsage.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void viewMonthlyBillButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_ViewMonthlyBill.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void viewPlanButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_ViewPlan.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void restartRouterButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_RestartRouter.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void savePaymentInfoButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_PaymentInfo.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void callForHelpButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_CallForHelp.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void checkInternetSpeedButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("User5_CheckInternetSpeed.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e) {

        }
    }


    @javafx.fxml.FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegisteredCustomerUser_5Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {

        }
    }
}