package com.example.oopispproject;

import java.io.Serializable;

public class InternetPlan implements Serializable {
    private String planID, plantType, planDivision, planArea, planPrice;

    public InternetPlan(String planID, String plantType, String planDivision, String planArea, String planPrice) {
        this.planID = planID;
        this.plantType = plantType;
        this.planDivision = planDivision;
        this.planArea = planArea;
        this.planPrice = planPrice;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlanDivision() {
        return planDivision;
    }

    public void setPlanDivision(String planDivision) {
        this.planDivision = planDivision;
    }

    public String getPlanArea() {
        return planArea;
    }

    public void setPlanArea(String planArea) {
        this.planArea = planArea;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    @Override
    public String toString() {
        return "InternetPlan{" +
                "planID='" + planID + '\'' +
                ", plantType='" + plantType + '\'' +
                ", planDivision='" + planDivision + '\'' +
                ", planArea='" + planArea + '\'' +
                ", planPrice='" + planPrice + '\'' +
                '}';
    }
}
