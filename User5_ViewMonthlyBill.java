package iub.oop.courseprojects.oopfinalproject;

public class User5_ViewMonthlyBill {
    private String billMonth;
    private String dueDate;
    private double usage;
    private double amount;

    public User5_ViewMonthlyBill() {
    }

    public User5_ViewMonthlyBill(String billMonth, String dueDate, double usage, double amount) {
        this.billMonth = billMonth;
        this.dueDate = dueDate;
        this.usage = usage;
        this.amount = amount;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getUsage() {
        return usage;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User5_ViewMonthlyBill{" +
                "billMonth='" + billMonth + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", usage=" + usage +
                ", amount=" + amount +
                '}';
    }
}
