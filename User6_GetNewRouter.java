package iub.oop.courseprojects.oopfinalproject;

public class User6_GetNewRouter {
    private String shippingAddress;
    private double totalCost;

    public User6_GetNewRouter() {
    }

    public User6_GetNewRouter(String shippingAddress, double totalCost) {
        this.shippingAddress = shippingAddress;
        this.totalCost = totalCost;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "User6_GetNewRouter{" +
                "shippingAddress='" + shippingAddress + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
