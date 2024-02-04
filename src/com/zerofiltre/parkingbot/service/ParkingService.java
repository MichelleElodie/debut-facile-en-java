package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.model.VehicleModelEnum;

import java.util.Date;

public class ParkingService {

  public Ticket processIncomingVehicle(Vehicle vehicle) {
    Ticket ticket = new Ticket();
    Date now = new Date();
    ticket.setEnteringTime(now);
    ticket.setVehicle(vehicle);
    return ticket;
  }


  public Ticket processExitingVehicle(Ticket ticket ){
    // (la methode retourne un ticket dou Ticket a la place de void ou static)
    // traiter la sortir dun vehicule et calculer son prix en fonction de la categorie du vehicule.
    // parametre ticket car on passe le ticket ala sortie du vehicule

    long now = new Date().getTime();
    now += 60 * 60 * 1000; // pr avoir 1 heure de temps

    Date exitTime = new Date(now); // creer une date de sorti au quel on ajoute 1 heure de temps
    ticket.setExitTime(exitTime); // on le definit coe le temps de sortir du ticket

    Vehicle vehicle = ticket.getVehicle(); // on extrait le vehicule du ticket car on a besoin du vehicule
    // pour calculer le prix de sortir dun vehicule precis
    VehicleModelEnum category = vehicle.getCategory(); // on extrait ou recupere la categorie du vehicule (getCategory est de type VehicleModelEnum )

    double pricePerMinForCitatine = 0.08;
    double pricePerMinFor2Roues = 0.02;
    double defaultPricePerMin = 0.05; // cas ou on ne connais pas le type de vehicule

    long durationInMinutes = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);
    //  le temps sera en milliseconde car (getTime() ) pr tansormer cette durer en minute on divise
    //  par la qtite de temps que represente une minute(/ (60*1000))

    double finalPrice = 0;

    // WITH IF

  /*  if ("CITADINE".equals(category)){

      finalPrice = durationInMinutes * pricePerMinForCitatine;

    }
    else if ("2 ROUES".equals(category)){
      finalPrice = durationInMinutes * pricePerMinFor2Roues;
    }
    else {
      finalPrice = durationInMinutes * defaultPricePerMin;
    }*/


    // WITH SWITCH

    switch (category){

      case CITADINE:
        finalPrice = durationInMinutes * pricePerMinForCitatine;
      break;

      case DEUXROUES:
        finalPrice = durationInMinutes * pricePerMinFor2Roues;
      break;

      default:
        finalPrice = durationInMinutes * defaultPricePerMin;
    }

    // definir le prix du ticket

    ticket.setAmount(finalPrice);

    return ticket;

  }

}
