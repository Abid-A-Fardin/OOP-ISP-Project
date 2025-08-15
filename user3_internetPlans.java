package com.example.finalproject;

import java.io.Serializable;

public class user3_internetPlans implements Serializable{
    private String planName;
    private double speedMbps, price;
    private boolean hasRouter, hasInstallationFee;

    public user3_internetPlans(String planName, double speedMbps, double price, boolean hasRouter, boolean hasInstallationfee) {
        this.planName = planName;
        this.speedMbps = speedMbps;
        this.price = price;
        this.hasRouter = hasRouter;
        this.hasInstallationFee = hasInstallationFee;
    }

    public String getPlanName() {
        return planName;
    }

    public user3_internetPlans setPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    public double getSpeedMbps() {
        return speedMbps;
    }

    public user3_internetPlans setSpeedMbps(double speedMbps) {
        this.speedMbps = speedMbps;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public user3_internetPlans setPrice(double price) {
        this.price = price;
        return this;
    }

    public boolean isHasRouter() {
        return hasRouter;
    }

    public user3_internetPlans setHasRouter(boolean hasRouter) {
        this.hasRouter = hasRouter;
        return this;
    }

    public boolean isHasInstallationFee() {
        return hasInstallationFee;
    }

    public user3_internetPlans setHasInstallationFee(boolean hasInstallationFee) {
        this.hasInstallationFee = hasInstallationFee;
        return this;
    }

    @Override
    public String toString() {
        return "user3_viewPlans{" +
                "planName='" + planName + '\'' +
                ", speedMbps=" + speedMbps +
                ", price=" + price +
                ", hasRouter=" + hasRouter +
                ", hasInstallationFee=" + hasInstallationFee +
                '}';
    }
}
