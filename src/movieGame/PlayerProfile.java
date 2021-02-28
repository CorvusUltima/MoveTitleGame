package src.movieGame;

import src.movieGame.hintGame.Player;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PlayerProfile extends Start {

    public static String playerName;
    public static String player;
    public static int playerAge;

    public void Players() {
        Starting();

        int ageLimit = 17;
        int ageMax = 65;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name!");
        playerName = input.nextLine();


        System.out.println("Welcome " + playerName);

        System.out.println("Please enter a number you want to play as:");
        player = input.nextLine();


        System.out.println(playerName + ":" + " You are playing as Player " + player);

        System.out.println("How old are you?");
        playerAge = input.nextInt();
        if (playerAge <= ageLimit) {
            System.out.println("Sorry " + playerName + " you are too young to play!");
            System.exit(0);
        } else if (playerAge >= ageMax) {
            System.out.println("Sorry " + playerName + " you are too old to play!");
            System.exit(0);
        } else {
            System.out.println("Continue to the game");
               try {
                              TimeUnit.SECONDS.sleep(2);
                          } catch (InterruptedException e) {
                              e.printStackTrace();
                          }
            System.out.println("This level 1, you will be playing against the computer!");

                try {
                               TimeUnit.SECONDS.sleep(4);
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                
                    System.out.println("You enter any number between 1 to 5, you can only attempt 7 times. ");
                                                                                                       
                  try {                                                                                
                                 TimeUnit.SECONDS.sleep(4);                                         
                             } catch (InterruptedException e) {                                        
                                 e.printStackTrace();                                                  
                             }


                     System.out.println("Invalid number is not accepted but included in your playing attempts");
                try {
                       TimeUnit.SECONDS.sleep(4);
               }catch (InterruptedException e) {
                 e.printStackTrace();
               }
            System.out.println("Good luck!");
                try {
                       TimeUnit.SECONDS.sleep(4);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }

}


    }

    public void PrintTicket() {
         System.out.println("Movie Ticket for Player No: " + player);
         System.out.println("NAME: " + playerName.toUpperCase());
         System.out.println("AGE: " + playerAge);
         System.out.println("TICKET NO: 57" + playerName.toUpperCase() +"89"+ player + playerAge );
         System.out.println("Write a review to help us improve.");
     }
}