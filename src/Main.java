import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Main {


    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);
        Player.FirstToPlay(player1, player2);
        String movie = Movie.randomise();


        String hints[] = new String[3];
        if (Movie.randomise() == "Inception") {
            hints[0] = "bulja";
            hints[1] = "bulja";
            hints[2] = "bulja";
        }
        if (Movie.randomise() == "Godfathe") {
            hints[0] = "bulja";
            hints[1] = "bulja";
            hints[2] = "bulja";
        }
        if (Movie.randomise() == "Matrix") {
            hints[0] = "bulja";
            hints[1] = "bulja";
            hints[2] = "bulja";
        }
        if (Movie.randomise() == "FightClub") {
            hints[0] = "bulja";
            hints[1] = "bulja";
            hints[2] = "bulja";
        } else if (Movie.randomise() == "Goodfellas") {
            hints[0] = "bulja";
            hints[1] = "bulja";
            hints[2] = "bulja";
        }
        System.out.println("movie is " + movie + hints[0]);
    }
}





