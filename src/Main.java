import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Main {
int Points=50;


    public  static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);
        Player.FirstToPlay(player1, player2);
        Movie movie = new Movie();
        movie.SetAMovie();
        Scanner input = new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);

        if (player2.FirsttoPlay==true ) {
            System.out.println(player2.name + " " + "Enter your answer:" + player2.answer);
            player2.answer = input.nextLine();
        }
        if (player1.FirsttoPlay==true ) {

            System.out.println(player1.name + " " + "Enter your answer:" + player1.answer);
            player1.answer = input.nextLine();
        }


        if (player1.answer.toLowerCase().equals(movie.name.toLowerCase()))
            {System.out.println("Good guess!!");}
            else if (player2.answer.toLowerCase().equals(movie.name.toLowerCase()))
        {System.out.println("Good guess!!");}
        else if (!player1.answer.toLowerCase().equals(movie.name.toLowerCase())){
            System.out.println("your answer in not corect"+player2.name + "It is your chance now enter you answer:"+player2.answer);
            player2.answer = input.nextLine();
        }
        else if (!player2.answer.toLowerCase().equals(movie.name.toLowerCase())){
            System.out.println("your answer in not corect"+player1.name + "It is your chance now enter you answer:"+player1.answer);
            player1.answer = input.nextLine();
        }
        }
    }



}





