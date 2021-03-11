
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class MoveTitleGame {
     static String file_name="HS.txt";
     static int MatchGame=2;
     static int player1Points=0;
     static int player2Points=0;
     static int maxPoints=30;
     static int highScorePoints=0;
     static int nPlayers=2;




        public static void main(String[] args) throws IOException {


            String content = Files.readString(Path.of("src/Movies.txt"),StandardCharsets.US_ASCII);// created string file for future use


            Write HighScore = new Write(file_name, false);
            HighScore.ReadFile(file_name);

            Player player[] = new Player[2];

            for (int i = 0; i < nPlayers; i++) {
                player[i] = new Player();
                System.out.print("player" + "\t" + (i + 1) + " name:" + "\n");
                player[i].SetName();
            }


            System.out.print("Time to determine who goes first\n");

            do {
                player[0].nDice = Player.DiceRoll();
                System.out.print(player[0].sName + " rolled " + player[0].nDice + "\n");
                pressAnyKeyToContinue();
                player[1].nDice = Player.DiceRoll();
                System.out.print(player[1].sName + " rolled " + player[1].nDice + "\n");
                pressAnyKeyToContinue();
            } while (player[0].nDice == player[1].nDice);

            System.out.print(player[((player[0].nDice > player[1].nDice)) ? 0 : 1].sName + " goes first.\n");

            pressAnyKeyToContinue();

            int nTurnCounter = (player[0].nDice > player[1].nDice ? 0 : 1);

            while (true) {
                System.out.print(player[nTurnCounter % 2].sName + "'s turn\n");


                for (int i = 0; i < MatchGame; i++,++nTurnCounter) {
                    Movies movies = new Movies();

                    pressAnyKeyToContinue();

                    StartMovieGame(player[0] ,player[1],movies);

                }





                if (player1Points > player2Points) {
                    System.out.println("Congratulations " + "\t" + player[0].sName + "is victorious ");
                    if (player1Points > highScorePoints) {
                        System.out.println("Congratulations " + "\t" + player[0].sName + "\t" + "set a new record  ");
                        try {
                            HighScore.WriteToFile(player[0].sName);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        HighScore.ReadFile(file_name);

                    }

                } else if (player2Points > player1Points) {
                    System.out.println("Congratulations " + "\t" + player[1].sName + "\t" + "is victorious ");
                    if (player2Points > highScorePoints) {
                        System.out.println("Congratulations " + "\t" + player[1].sName + "\t" + "set a new record  ");
                        try {
                            HighScore.WriteToFile(player[0].sName);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        HighScore.ReadFile(file_name);

                    }

                } else {
                    System.out.print(" DRAW");
                }


            }
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



       public static void  StartMovieGame(Player player1,Player player2, Movies movies)
        {

    movies.SetAMovie();
    System.out.print("\n" + "It's time to guess"+"\n");
    pressAnyKeyToContinue();
    SetingPlayingOrder(player1,player2,movies);







}

       public static void pressAnyKeyToContinue()
        {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {

        }

    }
    public static void WinConditionChecker(int player1Points,int player2points,Player player1,Player player2,Write HighScore)throws IOException
    {
        if (player1Points > player2Points) {
            System.out.println("Congratulations " + "\t" + player1.sName + "is victorious ");
            if (player1Points > highScorePoints) {
                System.out.println("Congratulations " + "\t" + player1.sName + "\t" + "set a new record  ");
                try {
                    HighScore.WriteToFile(player1.sName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                HighScore.ReadFile(file_name);

            }

        } else if (player2Points > player1Points) {
            System.out.println("Congratulations " + "\t" + player2.sName + "\t" + "is victorious ");
            if (player2Points > highScorePoints) {
                System.out.println("Congratulations " + "\t" + player2.sName + "\t" + "set a new record  ");
                try {
                    HighScore.WriteToFile(player1.sName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                HighScore.ReadFile(file_name);
            }


        } else {
            System.out.print(" DRAW");
        }


    }
        public static void SetingPlayingOrder(Player player1,Player player2,Movies movies)
        {
        Scanner input = new Scanner(System.in);


       if(player1.bFrstToPlay)
       {
           for(int i=0;i<5;i++,maxPoints-=5)
           {
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player1.sName +"\t"+"Type your answer"+"\n");
           player1.answer = input.nextLine();

           if ( player1.answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("\n" + "Congratulations, the answer is correct ");
               player1Points+=maxPoints;
               System.out.print(player1.sName +"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
               break;
           }

           else { System.out.print( player2.sName +"\t"+" now is your turn"+"\n");
               System.out.print(player2.sName +"\t"+"Type your answer"+"\n");
               player2.answer = input.nextLine();
               if ( player2.answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct ");
                   player2Points+=maxPoints;
                   System.out.print(player2.sName +"\t"+"now have "+"\t"+player2Points+"\t"+"points"+"\n");
                   break;

               }
           }


             }

       }
        else if(!player1.bFrstToPlay)
       {
                  for(int i=0;i<5;i++)

           {
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player2.sName +"\t"+"Type your answer"+"\n");
           player2.answer = input.nextLine();

           if (player2.answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("Congratulations, the answer is correct ");
               player2Points+=maxPoints;
               System.out.print(player2.sName +"\t"+"now have "+"\t"+player2Points+"\t"+"points");
               break;
           }

           else {
               System.out.print( player1.sName +"\t"+" your turn to shoot "+"\n");
               System.out.print(player1.sName +"\t"+"Type your answer"+"\n");
               player1.answer = input.nextLine();

               if ( player1.answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct "+"\n");
                   player1Points+=maxPoints;
                   System.out.print(player1.sName +"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
                   break;
               }

           }
           }

       }
    }



}
