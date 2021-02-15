
import java.util.Scanner;

public class MoveTitleGame {

    static int dice1;
    static int dice2;
    static int diceWinner;
    static Player player1 = new Player();
    static Player player2 = new Player();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args ) {

        Dice dice = new Dice();

        //movies m = new movies();

        Scanner scan = new Scanner(System.in);
/*


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
        */
        boolean quit = false;

        while(quit != true)
        {
            startMenu();

            switch(scan.nextInt()) {

                case 1: System.out.println("Start game");

                    break;

                case 2: registerPlayers();

                    if(scan.nextInt() == 1) {
                         System.out.println("Start game");
                    } else quit = true;

                    break;

                case 3: quit = true;

            }

        }

    }
    static void startMenu() {
        System.out.println("============================");
        System.out.println("1. Start game");
        System.out.println("2. Register player");
        System.out.println("3. Quit");
        System.out.println("============================");
        System.out.print("Enter choice:");

    }
    static void registerPlayers() {

        System.out.println("============================");
        System.out.println("Enter name");
        System.out.print("Player 1:");
        player1.setName(scan.next());


        System.out.println("============================");
        System.out.println("Enter name");
        System.out.print("Player 2:");
        player2.setName(scan.next());

        System.out.println("============================");
        System.out.println("Player 1: " + player1.getName() + "\n" + "Player 2: " + player2.getName());

        System.out.println("============================");
        System.out.println("press:");
        System.out.println("1. start");
        System.out.println("2. quit");
    }

}
