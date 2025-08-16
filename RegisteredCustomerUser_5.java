package iub.oop.courseprojects.oopfinalproject;

public class RegisteredCustomerUser_5 extends User{
    public RegisteredCustomerUser_5(String name, String id, String type){
        super (name, id, type);
    }

    public void viewPlan() {
        System.out.println("Current Internet Plan");
    }
    public void viewMonthlyBill(){
        System.out.println("Monthly Bill Details");
    }
    public void restartRouter(){
        System.out.println("Restarting Router");
    }
    public void payBill(){
        System.out.println("Processing Bill Payment");
    }
    public void savePaymentInfo(){
        System.out.println("Saved Payment Information");
    }
    public void checkInternetUsage(){
        System.out.println("Internet Usage Report");
    }
    public void callForHelp(){
        System.out.println("Calling Customer Support");
    }

}
