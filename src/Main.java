import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Main {
int Points=50;
String answer;

    public  static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);
        Player.FirstToPlay(player1, player2);
        Movie movie=new Movie();
        movie.SetAMovie();

        System.out.println("Guess the movie name by hint : " +" "+ movie.hints[0]);

    }


}





