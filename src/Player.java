import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

        String name;
        int diceNum;

        public static void PlayerNames(Player player1, Player player2) {
                Scanner input = new Scanner(System.in);
                System.out.print("player 1 name:" + "\n");
                player1.name = input.nextLine();
                System.out.print("player 2 name:" + "\n");
                player2.name = input.nextLine();
        }

        public static int DiceCast() {
                int diceNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                return diceNum;
        }

        public static void FirstToPlay(Player player1, Player player2) {
                System.out.print(player1.name + "\t" + "\n" + "it's your turn to roll the dice good luck" + "\n");
                player1.diceNum = DiceCast();
                System.out.print(player1.name + "\t" + "your dice cast is " + "\t" + player1.diceNum + "\n");
                System.out.print(player2.name + "\t" + "it's your turn to roll the dice good luck" + "\n");
                player2.diceNum = DiceCast();
                System.out.print(player2.name + "\t" + "your dice cast is" + "\t" + player2.diceNum + "\n");
                if (player1.diceNum < player2.diceNum) {
                        System.out.println(player2.diceNum + " " + "will go first :");
                } else if (player1.diceNum > player2.diceNum) {
                        System.out.println(player1.name + " " + "goes first");
                } else if (player1.diceNum == player2.diceNum) {
                        System.out.print("\n" + "Draw, let's go one more time. " + "\n");

                        FirstToPlay(player1, player2);
                }

        }
}
