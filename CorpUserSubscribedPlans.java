package com.example.oopispproject;

import java.io.Serializable;

public class CorpUserSubscribedPlans implements Serializable {
    private AllCustomers customerID;
    private InternetPlan planID;

    public CorpUserSubscribedPlans(AllCustomers customerID, InternetPlan planID) {
        this.customerID = customerID;
        this.planID = planID;
    }

    public AllCustomers getCustomerID() {
        return customerID;
    }

    public void setCustomerID(AllCustomers customerID) {
        this.customerID = customerID;
    }

    public InternetPlan getPlanID() {
        return planID;
    }

    public void setPlanID(InternetPlan planID) {
        this.planID = planID;
    }

    @Override
    public String toString() {
        return "CorpUserSubscribedPlans{" +
                "customerID=" + customerID +
                ", planID=" + planID +
                '}';
    }
}
