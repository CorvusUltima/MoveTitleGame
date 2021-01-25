

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MoveTitleGame {

    public static void main(String[] args){

     int MatchGame=0;
     String player;
     String answer;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // takes input from the keyboard
        player = input.nextLine();
        System.out.print(player+"This is a game of guessing the movie title "+"\n");

            Movies movies = new Movies();
            movies.SetAMovie();
            MatchGame++;
            System.out.print(movies.name);
            System.out.print("\n");
            System.out.print(movies.hint1+"\n");
            System.out.print("answer:"+"\n");
            answer = input.nextLine();
            System.out.print(answer);





      if ( answer.equals(movies.name))
      {
          System.out.print("\n");
          System.out.print("Bravo ,bas si jebac ");

      }

       else{ System.out.print("\n");
          System.out.print("Usro si motku ");}

        }



   static String randomise() {

        String Inception = "Inception";
        String Godfather = "Godfather";
        String Matrix ="Matrix";
        String FightClub = "Fight Club";
        String Goodfellas = "Goodfellas";

       int rand = ThreadLocalRandom.current().nextInt(1, 5 + 1);

        if(rand==1)
        {
          return Inception;
        }
        else if(rand==2){
            return Godfather;
        }
        else if(rand==3){
            return Matrix;
        }
        else if(rand==4){
            return FightClub;
        }
        else if(rand==5){
            return Goodfellas;
        }
        else return "Error in Random method";

        }



}
