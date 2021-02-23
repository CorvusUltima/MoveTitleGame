
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class MoveTitleGame {

    static int dice1;
    static int dice2;
    static String diceWinner;
    static Player player1 = new Player();
    static Player player2 = new Player();
    static Scanner scan = new Scanner(System.in);
    static Dice dice = new Dice();
    Movies movies = new Movies();
    static Random random = new Random();

    static int movieCounter = 0;

    static Movies firstMovie = new Movies();
    static Movies secondMovie = new Movies();

    static boolean quit = false;
    static ArrayList<String> movieList = new ArrayList<>();



    public static void main(String[]args ) {

        movieList.add("Matrix");
        movieList.add("Godfather");
        Collections.shuffle(movieList);

        firstMovie.name = movieList.get(0);
        secondMovie.name = movieList.get(1);
        firstMovie.setAMovie();
        secondMovie.setAMovie();

        //System.out.println(movieList.get(movieCounter));

        boolean quit = false;

        while(!quit)
        {
            startMenu();

            switch (scan.nextInt()) {
                case 1 -> {
                    if(player1.getName() == null) {
                        System.out.println("You have to register 2 players first");
                        registerPlayers();
                    } else decideTurn();
                }
                case 2 -> registerPlayers();
                case 3 -> showScore();
                case 4 -> quit = true;
            }
        }

    }
    static void startMenu() {
        System.out.println("============================");
        System.out.println("1. Start Game");
        System.out.println("2. Register Player");
        System.out.println("3. Show Score");
        System.out.println("4. Quit");
        System.out.println("============================");
        System.out.print("Enter choice:");

    }
    static void registerPlayers() {
        System.out.println("============================");
        System.out.println("Enter Player 1 Name:");
        player1.setName(scan.next());


        System.out.println("============================");
        System.out.println("Enter Player 2 Name");
        player2.setName(scan.next());

        System.out.println("============================");
        System.out.println("Player 1: " + player1.getName() + "\n" + "Player 2: " + player2.getName());

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
        System.out.println(player1.getName() + " rolled:" + dice1);
        System.out.println("Press:");
        System.out.println("1. roll dice");
        System.out.println("2. quit");
        scan.next();

        dice2 = dice.rollDice();

        System.out.println("============================");
        System.out.println(player2.getName() + " rolled:" + dice2);

        boolean a = true;
        while(a) {

            if (dice1 > dice2) {

        diceWinner = player1.getName();

            player1.setTurnTrue();
            player2.setTurnFalse();
            a = false;

        }
        else if (dice2 > dice1) {
            diceWinner = player2.getName();

            player2.setTurnTrue();
            player1.setTurnFalse();
            a = false;

        } else if (dice1 == dice2) {
            System.out.println("Re-Roll");
                dice1 = dice.rollDice();
                dice2 = dice.rollDice();
                System.out.println("Player 1:" + dice1 + "\n" + "Player 2:" + dice2);
        } }
            System.out.println("============================");
            System.out.println(diceWinner + " Goes First");
            System.out.println("Press:");
            System.out.println("1. Start Game");
            System.out.println("2. Menu");

        switch (scan3.nextInt()) {
            case 1 -> game();
            case 2 -> quit = true;
        }
    }

    static void game() {
        int rounds;
        System.out.println("Enter Number of Rounds");
        rounds = scan.nextInt() * 2;

        for (int i = 0; i < rounds; i++) {

            Scanner scan2 = new Scanner(System.in);

            int tries = 0;
            int a = 0;

            String answer = "answer";
            String movie;
            Movies cMovie = new Movies();
            movie = movieList.get(movieCounter);
            cMovie.name = movie;
            cMovie.setAMovie();



                System.out.println("Press Any Key To Start Turn");
                scan2.nextLine();

            if (player1.getTurn()){
                System.out.println("============================");
                System.out.println(player1.getName() + "Turn to Guess");
            } else {System.out.println("============================");
                System.out.println(player2.getName() + "Turn to Guess");}


            while (!movie.toLowerCase().equals(answer.toLowerCase())) {

                System.out.println("============================");
                System.out.println("Guess The Movie");
                System.out.println("Hint: " + cMovie.hints[a]);
                System.out.println("Enter Answer:");

                answer = scan2.nextLine().toLowerCase();
                if (!movie.toLowerCase().equals(answer.toLowerCase())) {
                    System.out.println("============================");
                    System.out.println("Wrong answer,try again \n");
                    tries++;
                    a++;
                }

                System.out.println(answer.toUpperCase());

            if (movie.toLowerCase().equals(answer.toLowerCase())) {
                if (player1.getTurn() == true) {
                    player1.score = player1.score + 10 - tries;
                    player1.changeTurn();
                    player2.changeTurn();
                } else {
                    player2.score = player2.score + 10 - tries;
                    player1.changeTurn();
                    player2.changeTurn();
                }
            }

            }
            movieCounter++;
            System.out.println("============================");
            System.out.println("SCORE " + "\n" +
                    player1.getName().toUpperCase() + " " + player1.score + "\n" +
                    player2.getName().toUpperCase() + " " + player2.score);


        }
        if (player1.score > player2.score) {
            System.out.println("============================");
            System.out.println(player1.getName() + " IS THE WINNER!");
            System.out.println("============================");
        } else if (player1.score < player2.score) {
            System.out.println("============================");
            System.out.println(player2.getName() + " IS THE WINNER!");
        } else if (player1.score == player2.score) {
            System.out.println("============================");
            System.out.println("IT IS A DRAW!");
            System.out.println("============================");
        }

            quit = false;}

    static void showScore() {
        System.out.println("============================");
        System.out.println("SCORE " + "\n" +
                player1.getName().toUpperCase() + " " + player1.score + "\n" +
                player2.getName().toUpperCase() + " " + player2.score);
        System.out.println("Enter Any Key For Menu");
        scan.next();
                quit = false;

    }
}