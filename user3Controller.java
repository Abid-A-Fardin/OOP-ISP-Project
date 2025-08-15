package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.*;
import java.util.Scanner;

public class user3Controller {

    @FXML
    private BorderPane user3Dashboard;

    @FXML
    public void learnSetupProcessOnAction(ActionEvent actionEvent) {
        try{
            File r = new File("installation.txt");
            FileWriter fww= new FileWriter(r);
            fww.write("Step 1: Unbox your router and accesories.\n"+
                    "\nStep 2: Connect the power adapter.\n"+
                    "\nStep 3: Plug the LAN cable into your PC.\n" +
                    "\nStep 4: Power on the router.\n" +
                    "\nStep 5: Wait for internet lights to turn green.");
            fww.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_setup.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
            File setup = new File("installation.txt");
            Scanner sc = new Scanner(setup);
            String st ="" +"\n";
            while(sc.hasNextLine()){
                st += sc.nextLine() +"\n";
            }
            User3SetupController setupController = fxmlLoader.getController();
            setupController.setInstallationLabel(st);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void viewFAQsOnAction(ActionEvent actionEvent) {

        try {
            File f = new File("faq.txt");
            Scanner s = new Scanner(f);
            String str = "";
            while (s.hasNextLine()) {
                str += (s.nextLine()) + "\n";
            }
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("user3_faq.fxml"));
                user3Dashboard.setCenter(fxmlLoader.load());

                User3FaqController FaqController = fxmlLoader.getController();
                FaqController.setFaqLabel(str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
            }
            try {
                File fo = new File("faq.txt");
                FileWriter fw = new FileWriter(fo);
                fw.write("What plans are available?\n" +
                        "We are currently offering Basic, Standard and Premium plans.\n"
                        + "\nHow can I check coverage in my area?\n" +
                        "On our homepage, if you click the Check Coverage button in the left panel, you will be able to see if\n" + "" +
                        "we cover your area.\n" +
                        "\nHow do I pay? or How to select payment method?\n" +
                        "We accept both Cash on Delivery and Mobile Banking. Upon selecting your desired Internet plan, you\n" +
                        "will be \n" +
                        "automatically directed to the payment option where you can select your preferred payment option.\n"
                        + "\nHow to apply promotions?\n" +
                        "After selecting your desired Internet plan when you proceed to payment, you will see a designated box\n" +
                        "for promo code. You will enter your promo code there and get discount. You can find promo codes from \n" +
                        "promotions on the left panel of our homepage.");
                fw.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void testInternetSpeedOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_internetSpeed.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void checkCoverageOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_coverage.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void viewPlansOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_internetPlans.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
            User3InternetPlansController ipc = fxmlLoader.getController();

            File ip = new File("internetPlan.bin");
            FileOutputStream fos=null;
            ObjectOutputStream oos = null;

            if (ip.exists()) {
                fos = new FileOutputStream(ip, true);
                oos = new abc(fos);
            }
            else{
                fos = new FileOutputStream(ip);
                oos = new ObjectOutputStream(fos);
            }

            for (user3_internetPlans plans: ipc.planlist){
                oos.writeObject(plans);
            }
            oos.close();
        }
        catch (Exception e) {
        }
    }

    @FXML
    public void viewReviewsOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_review.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void viewPromotionsOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_promotions.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
            User3PromotionsController pc = fxmlLoader.getController();

            File p=new File("promotions.bin");
            FileOutputStream foss= null;
            ObjectOutputStream ooss = null;

            if(p.exists()){
                foss = new FileOutputStream(p, true);
                ooss = new abc(foss);
            }
            else{
                foss = new FileOutputStream(p);
                ooss = new ObjectOutputStream(foss);
            }
            for(user3_promotions promo: pc.promotionlist){
                ooss.writeObject(promo);
            }
            ooss.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void contactOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("user3_contact.fxml"));
            user3Dashboard.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
