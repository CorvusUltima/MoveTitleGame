package movieGame;

import java.util.Scanner;

public class PlayerProfile {



    public void Players() {
       // String player = "";


        int ageLimit = 17;
        int ageMax = 65;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name!");
        String playerName = input.nextLine();


        System.out.println("Welcome " + playerName);

        System.out.println("Please enter a number you want to play as!");
        String player = input.nextLine();


        System.out.println(playerName + ":" + " You are playing as Player " + player);

        System.out.println("How old are you?");
        int playerAge = input.nextInt();
        if (playerAge <= ageLimit) {
            System.out.println("Sorry " + player + " you are too young to play!");
        } else if (playerAge >= ageMax) {
            System.out.println("Sorry " + player + " you are too old to play!");
        } else {
            System.out.println("Continue playing!");
            System.out.println("You are playing against the computer!");
            System.out.println("Good luck!");




        }
    }

}








