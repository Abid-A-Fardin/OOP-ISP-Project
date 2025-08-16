package iub.oop.courseprojects.oopfinalproject;

public class User6_AskForATechnician {
    private String descriptionIssue;
    private String availableSlots;

    public User6_AskForATechnician() {
    }

    public User6_AskForATechnician(String descriptionIssue, String availableSlots) {
        this.descriptionIssue = descriptionIssue;
        this.availableSlots = availableSlots;
    }

    public String getDescriptionIssue() {
        return descriptionIssue;
    }

    public void setDescriptionIssue(String descriptionIssue) {
        this.descriptionIssue = descriptionIssue;
    }

    public String getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(String availableSlots) {
        this.availableSlots = availableSlots;
    }

    @Override
    public String toString() {
        return "User6_AskForATechnician{" +
                "descriptionIssue='" + descriptionIssue + '\'' +
                ", availableSlots='" + availableSlots + '\'' +
                '}';
    }
}
