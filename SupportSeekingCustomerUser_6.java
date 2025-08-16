package iub.oop.courseprojects.oopfinalproject;

public class SupportSeekingCustomerUser_6 extends User{
    public SupportSeekingCustomerUser_6 (String name, String id, String type){
        super (name, id, type);
    }
    public void changePlan(){
        System.out.println("Updating the Plan");
    }
    public void changePaymentMethod(){
        System.out.println("Updating Payment Method");
    }
    public void askForATechnician(){
        System.out.println("Scheduling a technician visit");
    }
    public void getNewRouter(){
        System.out.println("Request for a New Router");
    }
    public void readHelpGuide(){
        System.out.println("Display Help Guide");
    }
    public void resetPassword(){
        System.out.println("Resetting Password");
    }
    public void scheduleInstallation(){
        System.out.println("Scheduling Installation");
    }
    public void suspendServiceTemporarily(){
        System.out.println("Suspending Service Temporarily");
    }

}
