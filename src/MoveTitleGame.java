
import java.util.Scanner;

public class MoveTitleGame {

    static int dice1;
    static int dice2;
    static int diceWinner;

    public static void main(String[]args ) {

        Dice dice = new Dice();

        //movies m = new movies();

        Player player1 = new Player();

        Player player2 = new Player();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("============================");
        System.out.println("Enter name");
        System.out.print("Player 1:");

        player1.setName(scan.next());  // Read user input
        System.out.println("============================");
        System.out.println("Enter name");
        System.out.print("Player 2:");



        player2.setName(scan.next());
        System.out.println("============================");
        System.out.println("Player 1: " + player1.getName() + " Player 2: " + player2.getName());// Output user inp

        System.out.println("============================");
        System.out.print("press 1 to Start:");

        scan.next();

        System.out.println("============================");
        System.out.println("roll a dice to see who goes first");
        System.out.println("Player 1 rolls first");
        System.out.print("Press any button:");

        scan.next();

        dice1 = dice.rollDice();

        System.out.println("Player 1 rolled a:" + dice1);

        System.out.println("============================");
        System.out.println("Player 2:s turn");
        System.out.print("Press any button:");

        scan.next();

        dice2 = dice.rollDice();

        System.out.println("Player 2 rolled a:" + dice2);

        if (dice1 > dice2) {
            player1.changeTurn();

        } else {
            player2.changeTurn();
        }

        if (player1.getTurn()){
            System.out.println("hej");
        }

    }

}
