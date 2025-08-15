package com.example.finalproject;

import java.time.LocalDate;

public class user4_installation {
    private LocalDate installationDate;
    private String customerID;

    public user4_installation(LocalDate installationDate, String customerID) {
        this.installationDate = installationDate;
        this.customerID = customerID;
    }

    public LocalDate getInstallationDate() {
        return installationDate;
    }

    public user4_installation setInstallationDate(LocalDate installationDate) {
        this.installationDate = installationDate;
        return this;
    }

    public String getCustomerID() {
        return customerID;
    }

    public user4_installation setCustomerID(String customerID) {
        this.customerID = customerID;
        return this;
    }

    @Override
    public String toString() {
        return "user4_installation{" +
                "customerID='" + customerID + '\'' +
                ", installationDate=" + installationDate +
                '}';
    }
}
