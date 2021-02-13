package movieGame;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class RandomMovie extends PlayerProfile {

    public String randomMovie() {



        String gladiator = "Gladiator";
        String goodfellas = "Good Fellas";
        String fightClub = "Fight Club";
        String matrix = "Matrix";
        String inception = "Inception";

        Scanner input = new Scanner(System.in);
        //int playLimit = 10;
        //int playCount;
        System.out.println("Enter a number from 1 to 5");
        int total = 0;
        int randomNumber = input.nextInt();
        // input.nextInt((int)(Math.random()*5)); error
        int selectMovie = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        System.out.println(selectMovie);


        //noinspection LoopStatementThatDoesntLoop
       // for (playCount = 0; playCount < playLimit; playCount++ ) {
            if(randomNumber == selectMovie) {
               // total++;
                if (selectMovie == 1) {
                    System.out.println("Congrats you won the game!");
                    System.out.println("Your Random Movie is: ");
                    return gladiator;
                } else if (selectMovie == 2) {
                    System.out.println("Congrats you won the game!");
                    System.out.println("Your Random Movie is: ");
                    return goodfellas;
                } else if (selectMovie == 3) {
                    System.out.println("Congrats you won the game!");
                    System.out.println("Your Random Movie is: ");
                    return fightClub;
                } else if (selectMovie == 4) {
                    System.out.println("Congrats you won the game!");
                    System.out.println("Your Random Movie is: ");
                    return matrix;
                } else if (selectMovie == 5) {
                    System.out.println("Congrats you won the game!");
                    System.out.println("Your Random Movie is: ");
                    return inception;
                } else {
                    return "Invalid number";
                }
            }
            return "You are wrong";

        }
        //return "Number Play = " + playCount + " You have reached the maximum allowed";
    }







