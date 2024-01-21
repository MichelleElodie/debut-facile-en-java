package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicule;
import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBot {


  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   *             la classe main ou principale qui permet de gerer le traitement ou la class de traitement logique
   */
  public static void main(String[] args) {

    processvehicule();


  }

  private static void processvehicule() {
    Vehicule vehicule = new Vehicule();
    vehicule.setRegistrationNumber("LS-3245-PME");
    vehicule.setCategory("CITADINE");
    ParkingService parkingService = new ParkingService();
    Ticket ticket = parkingService.processIncomingVehicule(vehicule)/*creation et instanciation dun nouveau ticket*/;
    System.out.println(ticket);
  }


}
