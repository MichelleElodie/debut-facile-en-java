package com.zerofiltre.parkingbot.model;

public class Car extends Vehicle{

    @Override
    public String getCategory() {
        //return super.getCategory();
        return "CITADINE";
    }
}
