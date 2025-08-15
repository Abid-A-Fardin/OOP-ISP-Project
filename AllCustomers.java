package com.example.oopispproject;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;

public  class AllCustomers extends User implements Serializable{
    private String corpDivision, corpArea, corpHouseNumber, corpRoadNumber, corpCardNumber, corpCVC;
    private LocalDate corpDOE;


    public AllCustomers(String userID, String userPassword, String userType, String corpDivision, String corpArea, String corpHouseNumber, String corpRoadNumber, String corpCardNumber, String corpCVC, LocalDate corpDOE) {
        super(userID, userPassword, userType);
        this.corpDivision = corpDivision;
        this.corpArea = corpArea;
        this.corpHouseNumber = corpHouseNumber;
        this.corpRoadNumber = corpRoadNumber;
        this.corpCardNumber = corpCardNumber;
        this.corpCVC = corpCVC;
        this.corpDOE = corpDOE;
    }

    public String getCorpDivision() {
        return corpDivision;
    }

    public void setCorpDivision(String corpDivision) {
        this.corpDivision = corpDivision;
    }

    public String getCorpArea() {
        return corpArea;
    }

    public void setCorpArea(String corpArea) {
        this.corpArea = corpArea;
    }

    public String getCorpHouseNumber() {
        return corpHouseNumber;
    }

    public void setCorpHouseNumber(String corpHouseNumber) {
        this.corpHouseNumber = corpHouseNumber;
    }

    public String getCorpRoadNumber() {
        return corpRoadNumber;
    }

    public void setCorpRoadNumber(String corpRoadNumber) {
        this.corpRoadNumber = corpRoadNumber;
    }

    public String getCorpCardNumber() {
        return corpCardNumber;
    }

    public void setCorpCardNumber(String corpCardNumber) {
        this.corpCardNumber = corpCardNumber;
    }

    public String getCorpCVC() {
        return corpCVC;
    }

    public void setCorpCVC(String corpCVC) {
        this.corpCVC = corpCVC;
    }

    public LocalDate getCorpDOE() {
        return corpDOE;
    }

    public void setCorpDOE(LocalDate corpDOE) {
        this.corpDOE = corpDOE;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "corpDivision='" + corpDivision + '\'' +
                ", corpArea='" + corpArea + '\'' +
                ", corpHouseNumber='" + corpHouseNumber + '\'' +
                ", corpRoadNumber='" + corpRoadNumber + '\'' +
                ", corpCardNumber='" + corpCardNumber + '\'' +
                ", corpCVC='" + corpCVC + '\'' +
                ", corpDOE=" + corpDOE +
                ", userID='" + userID + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userType='" + userType + '\'' +
                ", " + super.toString() + '\'' +
                '}';
    }



    public int totalDays(LocalDate corpDOE) {
        Period p = Period.between(corpDOE, LocalDate.now());
        return p.getDays();


}

}
