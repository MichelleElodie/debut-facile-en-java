package com.zerofiltre.parkingbot;

import java.util.Locale;


public class ParkingBot {

    public static void main(String[] args) {
        sayHello(args[0]);
    }

    private static void sayHello(String arg) {
        String welcomeMessage = "Hello " + arg + ", bienvenue au parking Zerofiltre";
        String services = "Nous offrons les services suivants: Laveries, Gardineries etc...";
        String warning = "Depechez-vous d'entrer car il n'y aura bientot plus de places";
        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}
