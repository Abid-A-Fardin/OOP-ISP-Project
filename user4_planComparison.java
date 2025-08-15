package com.example.finalproject;

public class user4_planComparison {
    private user3_internetPlans plan1;
    private user3_internetPlans plan2;

    public user4_planComparison(user3_internetPlans plan1, user3_internetPlans plan2) {
        this.plan1 = plan1;
        this.plan2 = plan2;
    }

    public user3_internetPlans getPlan1() {
        return plan1;
    }

    public user4_planComparison setPlan1(user3_internetPlans plan1) {
        this.plan1 = plan1;
        return this;
    }

    public user3_internetPlans getPlan2() {
        return plan2;
    }

    public user4_planComparison setPlan2(user3_internetPlans plan2) {
        this.plan2 = plan2;
        return this;
    }

    @Override
    public String toString() {
        return "user4_planComparison{" +
                "plan1=" + plan1 +
                ", plan2=" + plan2 +
                '}';
    }
}
