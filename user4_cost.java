package com.example.finalproject;

import java.util.ArrayList;

public class user4_cost {
    private String promoCodee;
    private double price;
    private ArrayList<promoCode> promoCodes;

    public user4_cost(ArrayList<promoCode> promoCodes, double price) {

        this.promoCodes = promoCodes;
        this.price = price;
    }

    public String getPromoCode() {
        return promoCodee;
    }

    public user4_cost setPromoCode(String promoCodee) {
        this.promoCodee = promoCodee;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public user4_cost setPrice(double price) {
        this.price = price;
        return this;
    }
    ArrayList<promoCode> codes ;
    @Override
    public String toString() {
        return "user4_cost{" +
                ", promoCode='" + promoCodee + '\'' +
                ", price=" + price +
                '}';
    }
    public double totalCost(){
        double discount = 0.0;
        if(promoCodes!= null ){
            for(promoCode promo: codes){
                if(promo.getCodeName().equals(promoCodee)){
                    discount = promo.getDiscount();
                }
            }
        }
        double Amount= price* discount/100;
        return price-Amount;

    }
}
