package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class User6_ReadHelpGuideController {

    @FXML
    private ComboBox<String> guideCategoryComboBox;

    @FXML
    private TextArea guideContentTextArea;

    ArrayList<String> guideList;


    @FXML
    void guideCategoryComboBox(ActionEvent event) {
        String category = guideCategoryComboBox.getValue();
        String fileName = "";

        if (category.equals("Billing")) {
            fileName = "Billing.txt";
        } else if (category.equals("Technical")) {
            fileName = "Technical.txt";
        } else if (category.equals("CallForHelp")) {
            fileName = "CallForHelp.txt";
        }

        File f = new File("helpGuide/" + fileName);

        if (f.exists()) {
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                String line;
                String content = "";
                while ((line = br.readLine()) != null) {
                    content += line + "\n";
                }

                br.close();
                fr.close();

                guideContentTextArea.setText(content);

            } catch (Exception e) {
                guideContentTextArea.setText("Error reading help guide.");
            }
        } else {
            guideContentTextArea.setText("Help content not available.");
        }
    }

    @FXML
    void initialize(){
       guideList = new ArrayList<>();
       guideCategoryComboBox.getItems().addAll("Billing", "Technical", "CallForHelp");
    }

}
