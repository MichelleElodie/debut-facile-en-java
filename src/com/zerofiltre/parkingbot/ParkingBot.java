package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBot {
  static String completion = "des equipes Zerofiltre";
  static ParkingService parkingService = new ParkingService();

  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   */
  public static void main(String[] args) {
    sayHello();
    sayBye();
  }


  /**
   * Cette méthode permet de dire Hello
   */
  private static void sayHello() {
    String welcomeSentence = "Hello, recevez la bienvenue " +completion;
    System.out.println(welcomeSentence);
    String parkService = parkingService.parking;
    String washService = parkingService.washing;

    System.out.println(" nous offrons les services suivant: " +parkService+ " ET " +washService);


  }

  private static void sayBye() {
    System.out.println("Recevez les aurevoirs " +completion);
  }
}
