
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class MoveTitleGame {
    static String file_name = "HS.txt";
    static int nMatchGame = 2;
    static int nPointsMax = 30;
    static int highScorePoints = 0;
    static int nPlayers = 2;


    public static void main(String[] args) throws IOException

    {


        String content = Files.readString(Path.of("src/Movies.txt"), StandardCharsets.US_ASCII);// created string file for future use


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


        while(nMatchGame>0) {
            int nTurnCounter = (player[0].nDice > player[1].nDice ? 0 : 1);
            int nTurn = (player[0].nDice > player[1].nDice ? 0 : 1);
            int nHintCurrent = 0;
            Movies movies = new Movies();
            movies.SetAMovie();


            while (true) {

                Scanner input = new Scanner(System.in);

                int nPlayerIndex = nTurnCounter % 2;


                if (nTurn == nPlayerIndex) {
                    System.out.print(movies.hints[nHintCurrent++]+"\n");
                }
                System.out.print(player[nPlayerIndex].sName + "\t" + "Type your answer \n");
                player[nPlayerIndex].answer = input.nextLine();

                if (player[nPlayerIndex].answer.equals(movies.name)) {
                    player[nPlayerIndex].nPoints += (nPointsMax - (5 * (nHintCurrent)));
                    System.out.print(player[nPlayerIndex].sName + "\t" + "Your answer is correct" + "\n");
                    ;
                    break;
                } else {

                    System.out.print(player[nPlayerIndex].sName + "\t" + "Your answer is wrong" + "\n");
                    ++nTurnCounter;
                    ;
                }
        }
            nMatchGame--;
        }


                      int nPlayerWin = (player[0].nPoints > player[1].nPoints ? 0 : 1);


                       if( nPlayerWin==0||nPlayerWin==1 )
                       {
                           System.out.println("Congratulations " + "\t" + player[nPlayerWin].sName + "\t is victorious ");

                       }

                        else {
                         System.out.print(" DRAW");
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


       }




