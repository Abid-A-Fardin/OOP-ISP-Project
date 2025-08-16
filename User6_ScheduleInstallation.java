package iub.oop.courseprojects.oopfinalproject;

public class User6_ScheduleInstallation {
    private String timeSlot;
    private String address;

    public User6_ScheduleInstallation() {
    }

    public User6_ScheduleInstallation(String timeSlot, String address) {
        this.timeSlot = timeSlot;
        this.address = address;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User6_ScheduleInstallation{" +
                "timeSlot='" + timeSlot + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
