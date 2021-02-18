
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class MoveTitleGame {

    static int dice1;
    static int dice2;
    static int diceWinner;
    static Player player1 = new Player();
    static Player player2 = new Player();
    static Scanner scan = new Scanner(System.in);
    static Dice dice = new Dice();
    //movies m = new movies();
    static Random random = new Random();

    static int movieCounter = 0;

    static Movies firstMovie = new Movies();
    static Movies secondMovie = new Movies();

    static boolean quit = false;



    public static void main(String[]args ) {

        ArrayList<String> movieList = new ArrayList<>();
        movieList.add("Matrix");
        movieList.add("Godfather");

        firstMovie.name = movieList.get(0);
        secondMovie.name = movieList.get(0);
        firstMovie.setAMovie();

        Collections.shuffle(movieList);


        boolean quit = false;

        while(!quit)
        {
            startMenu();

            switch (scan.nextInt()) {
                case 1 -> decideTurn();
                case 2 -> {
                    registerPlayers();
                    if (scan.nextInt() == 1) {
                        decideTurn();
                    } else quit = true;
                }
                case 3 -> quit = true;
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
        System.out.println("Press:");
        System.out.println("1. start");
        System.out.println("2. quit");
    }

    static void decideTurn() {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("A dice will be rolled");
        System.out.println("to decide who goes first");
        System.out.println("============================");
        System.out.println("Press:");
        System.out.println("1. roll dice");
        System.out.println("2. quit");
        scan.next();

        dice1 = dice.rollDice();

        System.out.println("============================");
        System.out.println("Player 1 rolled:" + dice1);
        System.out.println("Press:");
        System.out.println("1. roll dice");
        System.out.println("2. quit");
        scan.next();

        dice2 = dice.rollDice();

        System.out.println("============================");
        System.out.println("Player 2 rolled:" + dice2);

        if (dice1 > dice2) {
            System.out.println("============================");
            System.out.println("Player 1 goes first");
            System.out.println("Press:");
            System.out.println("1. Start Game");
            System.out.println("2. Quit");
            scan.next();

            player1.setTurnTrue();
            player2.setTurnFalse();
        }
        if (dice2 > dice1) {
            System.out.println("============================");
            System.out.println("Player 2 goes first");
            System.out.println("Press:");
            System.out.println("1. Start Game");
            System.out.println("2. Quit");
            scan.next();

            player2.setTurnTrue();
            player1.setTurnFalse();


        } else {decideTurn();}

        switch (scan3.nextInt()) {
            case 1 -> game();
            case 2 -> quit = true;
        }
    }

    static void game() {
        Scanner scan2 = new Scanner(System.in);

        int tries = 0;

        String answer = "answer";

        while(!firstMovie.name.equals(answer)) {


            System.out.println("============================");
            System.out.println("Hint:");
            System.out.println(firstMovie.hints[tries]);
            System.out.println("Enter Answer:");

            answer = scan2.nextLine();
            if (!firstMovie.name.equals(answer)){
                System.out.println("============================");
                System.out.println("Wrong answer,try again \n" );
            }

            tries++;

            System.out.println(answer);
        }
        if (firstMovie.name.equals(answer))
        {
        switch(tries) {

            case 1: if (player1.turn) player1.score = player1.score + 5;
            else player2.score = player2.score + 5;

                break;

            case 2: if (player1.turn) player1.score = player1.score + 3;
            else player2.score = player2.score + 3;

                break;

            case 3: if (player1.turn) player1.score = player1.score + 2;
            else player2.score = player2.score + 2;

                break;

            default: if (player1.turn) player1.score = player1.score + 1;
            else player2.score = player2.score + 1;

        } } System.out.println(player2.score);

    player1.changeTurn();
    }


        }

