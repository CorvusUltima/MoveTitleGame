

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MoveTitleGame {

    public static void main(String[] args){

        //nova Grana samo za mene

     int MatchGame=0;
     String answer;



            Movies movies = new Movies();
            Player player1=new Player();
            Player player2=new Player();
            StartGame(player1,player2, movies);
            MatchGame++;



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
       System.out.print(player1.Name+"\t"+"tvoj red da bacis kockicu srecno"+"\n");
       pressAnyKeyToContinue();
       player1.diceNum=DiceCast();
       System.out.print(player1.Name+"\t"+"dobio si"+"\t"+player1.diceNum+"\n");

       System.out.print(player2.Name+"\t"+"tvoj red da bacis kockicu srecno"+"\n");
       pressAnyKeyToContinue();
       player2.diceNum=DiceCast();
       System.out.print(player2.Name+"\t"+"dobio si"+"\t"+player2.diceNum+"\n");


       if (player1.diceNum>player2.diceNum)
       {
           player1.FrstToPlay=true;
           System.out.print(player1.Name+"\t"+"Bravo ti prvi pogadjas"+"\n");
       }
       else if(player1.diceNum<player2.diceNum)
       {
           player2.FrstToPlay=true;
           System.out.print(player2.Name+"\t"+"Bravo ti prvi pogadjas"+"\n");
       }
       else if(player1.diceNum== player2.diceNum)
       {
           System.out.print("Nereseno je ,idemo opet sa kocikacam "+"\n");

           FirstToPlay( player1, player2);
       }
       }

       public static int DiceCast()
       {
           int rand = ThreadLocalRandom.current().nextInt(1, 5 + 1);
           return rand;
       }

     public static void  StartGame(Player player1,Player player2, Movies movies)
{

    movies.SetAMovie();
    Scanner input = new Scanner(System.in);
    System.out.print("Ime Player 1"+"\n");
    player1.Name = input.nextLine();
    System.out.print("Ime Player 2"+"\n");
    player2.Name = input.nextLine();
    System.out.print("Ovo je igra pogadjanja,prvi pogadja igrac koji bude imao vise srece na kockici"+"\n");
    pressAnyKeyToContinue();
    FirstToPlay(player1,player2);
    System.out.print("vreme je za prvi hint"+"\n");
    pressAnyKeyToContinue();
    playingOrder(player1,player2,movies);







}

    public static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static void playingOrder(Player player1,Player player2,Movies movies)
    {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

       if(player1.FrstToPlay)
       {
           for(int i=0;i<5;i++)
           {
           System.out.print(player1.Name+"\t"+"prvi pogadja"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player1.Name+"\t"+"Ukucaj svoj odgovor"+"\n");
           player1.Answer = input.nextLine();

           if ( player1.Answer.equals(movies.name))
           {
               System.out.print("\n");
               System.out.print("Bravo ,bas si jebac ");
               break;
           }

           else { System.out.print( player2.Name+"\t"+" pogadja sad"+"\n");
               System.out.print(player2.Name+"\t"+"Ukucaj svoj odgovor"+"\n");
               player2.Answer = input.nextLine();

               if ( player2.Answer.equals(movies.name))
               {
                   System.out.print("\n");
                   System.out.print("Bravo igrac2 ,bas si jebac ");
                   break;
               }
           }


             }

       }
        else if(!player1.FrstToPlay)
       {
                  for(int i=0;i<5;i++)

           {
           System.out.print(player2.Name+"prvi pogadja"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player2.Name+"\t"+"Ukucaj svoj odgovor"+"\n");
           player2.Answer = input.nextLine();

           if ( player2.Answer.equals(movies.name))
           {
               System.out.print("\n");
               System.out.print("Bravo ,bas si jebac ");
           }

           else {
               System.out.print( player1.Name+"\t"+" pogadja sad"+"\n");
               System.out.print(player1.Name+"\t"+"Ukucaj svoj odgovor"+"\n");
               player1.Answer = input.nextLine();

               if ( player1.Answer.equals(movies.name))
               {
                   System.out.print("\n");
                   System.out.print("Bravo igrac2 ,bas si jebac ");
               }

           }
           }

       }
    }

}
