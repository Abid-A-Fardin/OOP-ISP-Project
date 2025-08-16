package iub.oop.courseprojects.oopfinalproject;

public class User5_PaymentInfo {
    private String paymentMethod;
    private String cardNumber;
    private String cardHolderName;

    public User5_PaymentInfo() {
    }

    public User5_PaymentInfo(String paymentMethod, String cardNumber, String cardHolderName) {
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String toString() {
        return "User5_PaymentInfo{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }
}
