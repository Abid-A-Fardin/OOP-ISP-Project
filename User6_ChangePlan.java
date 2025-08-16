package iub.oop.courseprojects.oopfinalproject;

public class User6_ChangePlan {
    private String currentPlan;
    private String newPlan;
    private String effectiveDate;

    public User6_ChangePlan() {
    }

    public User6_ChangePlan(String currentPlan, String newPlan, String effectiveDate) {
        this.currentPlan = currentPlan;
        this.newPlan = newPlan;
        this.effectiveDate = effectiveDate;
    }

    public String getCurrentPlan() {
        return currentPlan;
    }

    public void setCurrentPlan(String currentPlan) {
        this.currentPlan = currentPlan;
    }

    public String getNewPlan() {
        return newPlan;
    }

    public void setNewPlan(String newPlan) {
        this.newPlan = newPlan;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "User6_ChangePlan{" +
                "currentPlan='" + currentPlan + '\'' +
                ", newPlan='" + newPlan + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                '}';
    }
}
