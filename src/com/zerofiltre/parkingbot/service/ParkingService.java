package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import java.util.Date;

public class ParkingService {

  public Ticket processIncomingVehicle(Vehicle vehicle) {
    /*methode pour creer un ticket*/
    Ticket ticket = new Ticket(); /*creer ticket*/
    Date now = new Date(); /*creer leticket*/
    ticket.setEnteringTime(now); /*associer la date au ticket, enregistrer leticket avec la date*/
    ticket.setVehicle(vehicle); /*associer le vehicule au ticket*/
    return ticket; /*retourner le ticket*/
  }

}
