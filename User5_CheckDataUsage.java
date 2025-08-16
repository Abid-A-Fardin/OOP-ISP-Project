package iub.oop.courseprojects.oopfinalproject;

import java.util.Map;

public class User5_CheckDataUsage {
    private String currentCycle;
    private double planLimit;
    private Map<String, Double> dailyUsage;

    public User5_CheckDataUsage() {
    }

    public User5_CheckDataUsage(String currentCycle, double planLimit, Map<String, Double> dailyUsage) {
        this.currentCycle = currentCycle;
        this.planLimit = planLimit;
        this.dailyUsage = dailyUsage;
    }

    public String getCurrentCycle() {
        return currentCycle;
    }

    public void setCurrentCycle(String currentCycle) {
        this.currentCycle = currentCycle;
    }

    public double getPlanLimit() {
        return planLimit;
    }

    public void setPlanLimit(double planLimit) {
        this.planLimit = planLimit;
    }

    public Map<String, Double> getDailyUsage() {
        return dailyUsage;
    }

    public void setDailyUsage(Map<String, Double> dailyUsage) {
        this.dailyUsage = dailyUsage;
    }

    @Override
    public String toString() {
        return "User5_CheckDataUsage{" +
                "currentCycle='" + currentCycle + '\'' +
                ", planLimit=" + planLimit +
                ", dailyUsage=" + dailyUsage +
                '}';
    }
}
