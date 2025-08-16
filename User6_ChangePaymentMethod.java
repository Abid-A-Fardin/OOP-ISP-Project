package iub.oop.courseprojects.oopfinalproject;

public class User6_ChangePaymentMethod {
    private String currentPaymentMethod;
    private String newPaymentMethod;
    private String paymentMethodInformation;

    public User6_ChangePaymentMethod() {
    }

    public User6_ChangePaymentMethod(String currentPaymentMethod, String newPaymentMethod, String paymentMethodInformation) {
        this.currentPaymentMethod = currentPaymentMethod;
        this.newPaymentMethod = newPaymentMethod;
        this.paymentMethodInformation = paymentMethodInformation;
    }

    public String getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(String currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public String getNewPaymentMethod() {
        return newPaymentMethod;
    }

    public void setNewPaymentMethod(String newPaymentMethod) {
        this.newPaymentMethod = newPaymentMethod;
    }

    public String getPaymentMethodInformation() {
        return paymentMethodInformation;
    }

    public void setPaymentMethodInformation(String paymentMethodInformation) {
        this.paymentMethodInformation = paymentMethodInformation;
    }

    @Override
    public String toString() {
        return "User6_ChangePaymentMethod{" +
                "currentPaymentMethod='" + currentPaymentMethod + '\'' +
                ", newPaymentMethod='" + newPaymentMethod + '\'' +
                ", paymentMethodInformation='" + paymentMethodInformation + '\'' +
                '}';
    }
}
