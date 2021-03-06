
import java.io.IOException;

import java.util.Scanner;


public class MoveTitleGame {
    static String file_name = "HS.txt";
    static int nMatchGame = 2;
    static int nPointsMax = 30;
    static int highScorePoints = 0;
    static int nPlayers = 2;


    public static void main(String[] args) throws IOException

    {


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
            //System.out.print(movies.name+"spacejetulilinije");
            //pressAnyKeyToContinue();

            while (true) {
                Scanner input = new Scanner(System.in);
                int nPlayerIndex = nTurnCounter % 2;
                if (nTurn == nPlayerIndex) {
                    System.out.print(movies.hints[nHintCurrent++]+"\n");
                }
                System.out.print(player[nPlayerIndex].sName + "\t" + "Type your answer \n");
                player[nPlayerIndex].answer = input.nextLine();
                if (player[nPlayerIndex].answer.toLowerCase().equals(movies.name.toLowerCase())) {
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
             movies.SetAMovie();
             nMatchGame--;
        }
                      int nPlayerWin = (player[0].nPoints > player[1].nPoints ? 0 : 1);

                       if( player[0].nPoints==player[1].nPoints )
                       {
                           System.out.print(" DRAW");
                       }
                        else {
                           System.out.println("Congratulations " + "\t" + player[nPlayerWin].sName + "\t is victorious ");
                        }
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




