package com.zerofiltre.parkingbot.model;

/*
 classe de donne sera creer ici cest a dire elle ne contiendront
 juste des attributs et des methodes accesseurs

*/

public class Vehicule {

    private  String registrationNumber;
    private String category;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
