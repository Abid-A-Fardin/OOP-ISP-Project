package iub.oop.courseprojects.oopfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;


public class User5_PayBillController
{
    @javafx.fxml.FXML
    private TextField paymentDetailsTextField;
    @javafx.fxml.FXML
    private TextField accountNumberTextField;
    @javafx.fxml.FXML
    private TextField billAmountTextField;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @FXML
    private TextArea loadInfotextArea;

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Cash payment", "Card Payment", "Online payment");
    }

    @FXML
    public void confirmPaymentButton(ActionEvent actionEvent) {
        String accountNumber= accountNumberTextField.getText();
        String bill= billAmountTextField.getText();
        String paymentComboBox= paymentMethodComboBox.getValue();
        String paymentDetails= paymentDetailsTextField.getText();


        if (accountNumberTextField.getText()==null || accountNumberTextField.getText().isEmpty() ||
                billAmountTextField.getText() == null || billAmountTextField.getText().isEmpty() ||
                paymentMethodComboBox.getValue() == null || paymentMethodComboBox.getValue().isEmpty()||
                paymentDetailsTextField.getText() == null || paymentDetailsTextField.getText().isEmpty()
        ) {

            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Fill in Appropriate Information");
            errorAlert.show();
            return;
        }

        boolean noDigitFound = false;
        for (int i=0; i<billAmountTextField.getText().length(); i++) {
            if (billAmountTextField.getText().charAt(i) < '0' || billAmountTextField.getText().charAt(i) > '9') {
                noDigitFound = true;
                break;
            }
        }

        if (noDigitFound) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Accurate Information Needed");
            errorAlert.show();
            return;
        }



        noDigitFound = false;
        for (int i=0; i<accountNumberTextField.getText().length(); i++) {
            if (accountNumberTextField.getText().charAt(i) < '0' || accountNumberTextField.getText().charAt(i) > '9') {
                noDigitFound = true;
                break;
            }
        }

        if (noDigitFound) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Accurate Information Needed");
            errorAlert.show();
            return;
        }

        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setContentText("Paid Successfully");
        successAlert.show();

        try {
            File file = new File("Payment.bin");
            boolean append = file.exists();

            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos;

            if (append) {
                oos = new ObjectOutputStream(fos) {
                    @Override
                    protected void writeStreamHeader(){
                    }
                };
            } else {
                oos = new ObjectOutputStream(fos);
            }

            String[] paymentData = {accountNumberTextField.getText(),
                    billAmountTextField.getText()};
            oos.writeObject(paymentData);

            oos.close();
            fos.close();
        } catch (Exception e) {

        }



        accountNumberTextField.clear();
        billAmountTextField.clear();
        paymentMethodComboBox.setValue(null);
        paymentDetailsTextField.clear();
    }

    @FXML
    public void loadInfoButton(ActionEvent actionEvent) {
        try {
            File file = new File("Payment.bin");
            if (!file.exists()) {
                loadInfotextArea.setText("No saved payments found.");
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            StringBuilder sb = new StringBuilder();
            while (fis.available() > 0) {
                try {
                    String[] paymentData = (String[]) ois.readObject();
                    sb.append("Account Number: ").append(paymentData[0]).append("\n");
                    sb.append("Bill Amount: ").append(paymentData[1]).append("\n");

                } catch (Exception e) {
                    break;
                }
            }

            ois.close();
            fis.close();

            loadInfotextArea.setText(sb.toString());

        } catch (Exception e) {

            loadInfotextArea.setText("Error reading payment information.");
        }
    }

}