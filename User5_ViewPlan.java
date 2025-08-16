package iub.oop.courseprojects.oopfinalproject;

import java.time.LocalDate;

public class User5_ViewPlan {
    private String planName;
    private String features;
    private int usageLimit;
    private LocalDate renewalDate;
    private int price;

    public User5_ViewPlan() {
    }

    public User5_ViewPlan(String planName, String features, int usageLimit, LocalDate renewalDate, int price) {
        this.planName = planName;
        this.features = features;
        this.usageLimit = usageLimit;
        this.renewalDate = renewalDate;
        this.price = price;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "User5_ViewPlan{" +
                "planName='" + planName + '\'' +
                ", features='" + features + '\'' +
                ", usageLimit=" + usageLimit +
                ", renewalDate=" + renewalDate +
                ", price=" + price +
                '}';
    }
}

