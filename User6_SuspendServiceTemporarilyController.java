package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class User6_SuspendServiceTemporarilyController {

    @FXML
    private CheckBox acceptsChargesCheckBox;

    @FXML
    private Button confirmSuspensionButton;

    @FXML
    private ComboBox<String> durationOfSuspensionComboBox;

    @FXML
    private AnchorPane suspendServiceTemporarilyScene;

    @FXML
    private TextField suspendedDateTextField;

    @FXML
    private TextArea termsAndConditionsTextArea;

    @FXML
    void confirmSuspensionButton(ActionEvent event) {

    }

}
