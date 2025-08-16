package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;


public class User5_CallForHelpController {

    @FXML
    private ComboBox<String> selectsIssueComboBox;

    @FXML
    private TextField issueDetailsTextField;
    @FXML
    private AnchorPane contactSupportScene;
    @FXML
    private Button sendsIssueDetailsButton;


    @FXML
    void sendsIssueDetailsButton(ActionEvent event) {
        String issue = selectsIssueComboBox.getValue();
        String description = issueDetailsTextField.getText();
        if (selectsIssueComboBox.getValue()==null || selectsIssueComboBox.getValue().isEmpty() ||
            issueDetailsTextField.getText() == null ||issueDetailsTextField.getText().isEmpty()
            ) {

            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Select Issue");
            errorAlert.show();
        }
        else {

            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("Sent Successfully");
            successAlert.show();
        }

        selectsIssueComboBox.setValue(null);
        issueDetailsTextField.clear();
    }

    @FXML
    public void initialize(){
        selectsIssueComboBox.getItems().addAll("Billing", "Technical", "Connection");

    }


}