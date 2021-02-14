import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Main {
    int Points = 50;
    static String p1answer;
    static String p2answer;


    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);
        Player.FirstToPlay(player1, player2);
        Movie movie = new Movie();
        movie.SetAMovie();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);

            if (player2.FirsttoPlay == true) {
                System.out.println(player2.name + " " + "Enter your answer:");
                p2answer = input.nextLine();
                if (p2answer.equalsIgnoreCase(movie.name)) {
                    System.out.println("Good guess!!");
                } else if (!p2answer.equalsIgnoreCase(movie.name)) {
                    System.out.println("your answer in not correct" + player1.name + "It is your chance now enter you answer:");
                    p1answer = input.nextLine();
                    if (p1answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                    } else if (!p1answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Both answers are wrong");
                    }
                } else if (player1.FirsttoPlay == true) {

                    System.out.println(player1.name + " " + "Enter your answer:");
                    p1answer = input.nextLine();
                    System.out.println(p1answer);
                    if (p1answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                    } else if (!p1answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + player2.name + "It is your chance now enter you answer:");
                        p2answer = input.nextLine();
                        if (p2answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                        } else if (!p2answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");

                        }
                    }

                }


            }
        }
    }
}




