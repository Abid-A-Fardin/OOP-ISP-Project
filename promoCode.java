package com.example.finalproject;

public class promoCode {
    private String codeName;
    private double discount;

    public promoCode(String codeName, double discount) {
        this.codeName = codeName;
        this.discount = discount;
    }

    public String getCodeName() {
        return codeName;
    }

    public promoCode setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public promoCode setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return "promoCode{" +
                "codeName='" + codeName + '\'' +
                ", discount=" + discount +
                '}';
    }
}
