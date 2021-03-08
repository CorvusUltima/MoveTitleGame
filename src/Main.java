import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int gameround = 1;
        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);

        Movie movie = new Movie();

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Player.FirstToPlay(player1, player2);
            }

            movie.SetAMovie();
            Scanner input = new Scanner(System.in);
            gameround++;

            for (int j = 0; j < 5; j++) {

                if (player2.FirsttoPlay) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[j]);
                    System.out.println("Round 1");
                    System.out.println(player2.name + " " + "Enter your answer:");
                    player2.answer = input.nextLine();
                    if (player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        player2.Points += 10;
                        gameround++;
                        break;
                    } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player1.name + " " + "It is your chance now enter you answer:");
                        player1.answer = input.nextLine();
                        player2.Points -= 5;
                        if (player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            player1.Points += 10;
                            gameround++;
                            break;
                        } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player1.Points -= 5;
                        }
                    }
                } else if (player1.FirsttoPlay == true) {
                    System.out.println("Round 1");
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[j]);
                    System.out.println(player1.name + " " + "Enter your answer:");
                    player1.answer = input.nextLine();
                    if (player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        player1.Points += 10;
                        gameround++;
                        break;
                    } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player2.name + " " + "It is your chance now enter you answer:");
                        player2.answer = input.nextLine();
                        player1.Points -= 5;
                        if (player2.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            player2.Points += 10;
                            gameround++;
                            break;
                        }
                    } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Both answers are wrong");
                        player2.Points -= 5;
                        System.out.println(gameround);
                    }
                }
            }
        }
        System.out.println(player1.name + " " + "have" + player1.Points + " " + player2.name + " " + "have" + player2.Points + " ");


        if (player1.Points > player2.Points) {System.out.println("Winner is :"+player1.name);}
        else if (player2.Points >player1.Points){System.out.println("Winner is :"+player2.name);}
        else { System.out.println("It is tie !");}
    }
}






