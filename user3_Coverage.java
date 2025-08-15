package com.example.finalproject;

public class user3_Coverage {
    private String areaName;
    private boolean isCovered;

    public user3_Coverage(String areaName, boolean isCovered){
        this.areaName=areaName;
        this.isCovered= isCovered;
    }

    public String getAreaName() {
        return areaName;
    }

    public user3_Coverage setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public user3_Coverage setCovered(boolean covered) {
        isCovered = covered;
        return this;
    }

    @Override
    public String toString() {
        return "user3_checkCoverage{" +
                "areaName='" + areaName + '\'' +
                ", isCovered=" + isCovered +
                '}';
    }
}
