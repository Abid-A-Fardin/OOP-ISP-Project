package iub.oop.courseprojects.oopfinalproject;

import java.io.Serializable;

public class User5_PayBill implements Serializable {

    private String accountNumber;
    private double amount;
    private String paymentMethod;
    private String paymentDetails;

    public User5_PayBill() {
    }

    public User5_PayBill(String accountNumber, double amount, String paymentMethod, String paymentDetails) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDetails = paymentDetails;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

}
