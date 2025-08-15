package com.example.finalproject;

import java.io.Serializable;
import java.time.LocalDate;

public class user3_promotions implements Serializable {
    private String promoCode, description;
    private LocalDate validity;

    public user3_promotions(String promoCode, String description, LocalDate validity){
        this.promoCode= promoCode;
        this.description=description;
        this.validity= validity;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public user3_promotions setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public user3_promotions setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public user3_promotions setValidity(LocalDate validity) {
        this.validity = validity;
        return this;
    }

    @Override
    public String toString() {
        return "user3_viewPromotions{" +
                "promoCode='" + promoCode + '\'' +
                ", description='" + description + '\'' +
                ", validity=" + validity +
                '}';
    }
}
