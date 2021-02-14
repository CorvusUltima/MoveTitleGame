import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit ;

public class Player {

        String name;
        int diceNum;
        boolean FirsttoPlay;
        String answer;
        int Points = 50;


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
                try {
                        TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                System.out.print(player2.name + "\t" + "it's your turn to roll the dice good luck" + "\n");
                try {
                        TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                player2.diceNum = DiceCast();
                System.out.print(player2.name + "\t" + "your dice cast is" + "\t" + player2.diceNum + "\n");
                if (player1.diceNum < player2.diceNum) {
                        System.out.println(player2.name + " " + "will go first :");
                        player2.FirsttoPlay = true;
                        try {
                                TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                } else if (player1.diceNum > player2.diceNum) {
                        System.out.println(player1.name + " " + "goes first");
                        player1.FirsttoPlay = true;
                        try {
                                TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                } else if (player1.diceNum == player2.diceNum) {
                        System.out.print("\n" + "Draw, let's go one more time. " + "\n");
                        try {
                                TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                        FirstToPlay(player1, player2);
                }


        }

}

