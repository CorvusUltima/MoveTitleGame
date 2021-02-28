package src.movieGame;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RandomMovie extends PlayerProfile {

    //Level 1
    public String randomMovie() {

        String gladiator = "Gladiator";
        String goodfellas = "Good Fellas";
        String fightClub = "Fight Club";
        String matrix = "Matrix";
        String inception = "Inception";

        Scanner input = new Scanner(System.in);
        int playLimit = 7;
        int playCount;
        int score = 5;
        boolean controlLevelOne = false;

        for (playCount = 0; playCount < playLimit; playCount++ ) {

            System.out.println("Enter a number from 1 to 5");

            int randomNumber = input.nextInt();
            if( randomNumber > 5)
            {
                System.out.println("Invalid number");
                continue;
            }
            int selectMovie = ThreadLocalRandom.current().nextInt(1, 5 + 1);
            System.out.println(selectMovie);

            if (randomNumber == selectMovie) {
                controlLevelOne = true;
                if (selectMovie == 1) {
                    System.out.println("Your Random Movie is: Gladiator ");
                    System.out.println("Congrats you won the game! You have got " + score + " points.");
                    break;
                } else if (selectMovie == 2) {
                    System.out.println("Your Random Movie is: Good Fellas ");
                    System.out.println("Congrats you won the game! You have got " + score + " points.");
                    break;
                } else if (selectMovie == 3) {
                    System.out.println("Your Random Movie is: Fight Club ");
                    System.out.println("Congrats you won the game!You have got "  + score + " points.");
                    break;
                } else if (selectMovie == 4) {
                    System.out.println("Your Random Movie is: Matrix ");
                    System.out.println("Congrats you won the game! You have got "  + score + " points.");
                    break;
                } else if (selectMovie == 5) {
                    System.out.println("Your Random Movie is: Inception ");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Congrats you won the game! You have got "  + score + " points.");
                    break;
                }
            }
            else {
                System.out.println("You are wrong");
                continue;
            }


        }
        //Call Level 2 method here
        if(controlLevelOne){
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("You are now qualified to play Level 2.");
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("This Level 2, you need to provide movie name of a lead Actor given to you.");

            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("First letter of each word of your answer to be provided must be capital letter.");

            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("You need 5 points to win this level.");
            System.out.println("Good luck!");

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            MovieHint();
            return "";
        }
        return "Sorry playing limit exceeded. Exiting game.....";

    }

    //Level 2
    private void MovieHint() {
        String hint1 = "1.The name of the Lead actor is Keanu Reeves.";
        String answer1 = "Matrix";
        String hint2 = "2. The name of the Lead actor is Leonardo Dicaprio.";
        String answer2 = "Inception";
        String hint3 = "3. The name of the Lead actor is Ray Liotta.";
        String answer3 = "Good Fellas";
        String hint4 = "4. The name of the Lead actor is Brad Pitt.";
        String answer4 = "Fight Club";
        String hint5 = "5. The name of the Lead actor is Russell Crowe.";
        String answer5 = "Gladiator";


        Hint [] hints = {
                new Hint(hint1, answer1),
                new Hint(hint2, answer2),
                new Hint(hint3, answer3),
                new Hint(hint4, answer4),
                new Hint(hint5, answer5)


        };
        play(hints);

    }

    public static void play(Hint [] hints){
        int score = 0;
        boolean controlLevelTwo = false;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < hints.length; i++){
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(hints[i].prompt);
            String answer = input.nextLine();
            if(answer.equals(hints[i].answer)) {
                score++;
                System.out.println(" Your score is: " + score + " points");
            } else {
                System.out.println("You are wrong, your point remains: " + score + " points");
            }

        }
        if (score == 5){
            RandomMovie printTicket = new RandomMovie();
            System.out.println("You got " + score + "/" + hints.length );
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Congratulation! You won the 2 levels. Print out your Movie ticket.");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printTicket.PrintTicket();
        }
    }


}




