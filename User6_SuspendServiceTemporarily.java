package iub.oop.courseprojects.oopfinalproject;

public class User6_SuspendServiceTemporarily {
    private int maxduration=3;
    private double monthlyfee = 50.0;
    private int duration;
    private boolean acceptedCheckBox;
    private String suspendedUntilDate;

    public User6_SuspendServiceTemporarily() {
    }

    public User6_SuspendServiceTemporarily(int maxduration, double monthlyfee, int duration, boolean acceptedCheckBox, String suspendedUntilDate) {
        this.maxduration = maxduration;
        this.monthlyfee = monthlyfee;
        this.duration = duration;
        this.acceptedCheckBox = acceptedCheckBox;
        this.suspendedUntilDate = suspendedUntilDate;
    }

    public int getMaxduration() {
        return maxduration;
    }

    public void setMaxduration(int maxduration) {
        this.maxduration = maxduration;
    }

    public double getMonthlyfee() {
        return monthlyfee;
    }

    public void setMonthlyfee(double monthlyfee) {
        this.monthlyfee = monthlyfee;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAcceptedCheckBox() {
        return acceptedCheckBox;
    }

    public void setAcceptedCheckBox(boolean acceptedCheckBox) {
        this.acceptedCheckBox = acceptedCheckBox;
    }

    public String getSuspendedUntilDate() {
        return suspendedUntilDate;
    }

    public void setSuspendedUntilDate(String suspendedUntilDate) {
        this.suspendedUntilDate = suspendedUntilDate;
    }

    @Override
    public String toString() {
        return "User6_SuspendServiceTemporarily{" +
                "maxduration=" + maxduration +
                ", monthlyfee=" + monthlyfee +
                ", duration=" + duration +
                ", acceptedCheckBox=" + acceptedCheckBox +
                ", suspendedUntilDate='" + suspendedUntilDate + '\'' +
                '}';
    }
}
