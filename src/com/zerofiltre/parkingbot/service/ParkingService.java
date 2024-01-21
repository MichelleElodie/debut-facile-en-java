package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicule;

import java.util.Date;

/*
Ici on definit une classe logique c'est a dire aucun attribut nest definit rien que des methodes
 de traitement logique, qui utilise les classe de donnee
*/
public class ParkingService {

    public Ticket processIncomingVehicule(Vehicule vehicule){ /*quand on se presente au parking on se presente avec un vehicule raison pour laquelle on definit *vehicule en parametre**/

        /*comme on veux retouner un ticket il faut donc tous dabord le creer pour le retourner au sortir de la methode*/

        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicule);

        return ticket;


    }
}
