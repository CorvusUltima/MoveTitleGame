

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MoveTitleGame {

    public static void main(String[] args){

        //nova Grana samo za mene

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
            Player player1=new Player();
            Player player2=new Player();
            movies.SetAMovie();
            FirstToPlay(player1,player2);


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

   public static void FirstToPlay(Player player1,Player player2)
   {

       player1.diceNum=DiceCast();
       player2.diceNum=DiceCast();

       if (player1.diceNum>player2.diceNum)
       {
           player1.FrstToPlay=true;
       }
       else if(player1.diceNum<player2.diceNum)
       {
           player2.FrstToPlay=true;
       }
       else if(player1.diceNum== player2.diceNum)
       {
           FirstToPlay( player1, player2);
       }
       }

    public static int DiceCast()
       {
           int rand = ThreadLocalRandom.current().nextInt(1, 5 + 1);
           return rand;
       }




}
