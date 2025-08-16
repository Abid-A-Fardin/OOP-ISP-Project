package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SupportSeekingCustomerUser_6DashboardController
{
    @javafx.fxml.FXML
    private BorderPane dashboardBorderpane;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void resetPasswordButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_ResetPassword.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }

    }


    @javafx.fxml.FXML
    public void changePlanButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_ChangePlan.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void askForTechnicianButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_AskForATechnician.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }


    @javafx.fxml.FXML
    public void readHelpGuideButton(ActionEvent actionEvent) {try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_ReadHelpGuide.fxml"));
        dashboardBorderpane.setCenter(fxmlLoader.load());
    }
    catch (Exception e){

    }
    }

    @javafx.fxml.FXML
    public void scheduleInstallationButton(ActionEvent actionEvent) {try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_ScheduleInstallation.fxml"));
        dashboardBorderpane.setCenter(fxmlLoader.load());
    }
    catch (Exception e){

    }
    }

    @javafx.fxml.FXML
    public void changePaymentMethodButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_ChangePaymentMethod.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void getNewRouterButton(ActionEvent actionEvent) {try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_getNewRouter.fxml"));
        dashboardBorderpane.setCenter(fxmlLoader.load());
    }
    catch (Exception e){

    }
    }


    @javafx.fxml.FXML
    public void suspendServiceTemporarilyButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User6_SuspendServiceTemporarily.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportSeekingCustomerUser_6Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {

        }
    }
}