import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int gameround = 0;
        Player player1 = new Player();
        Player player2 = new Player();
        Player.PlayerNames(player1, player2);
        Movie movie = new Movie();
        if (gameround == 0) {
            Player.FirstToPlay(player1, player2);
            movie.SetAMovie();
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {

                if (player2.FirsttoPlay == true) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                    System.out.println(player2.name + " " + "Enter your answer:");
                    player2.answer = input.nextLine();
                    if (player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        gameround++;
                        break;

                    } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player1.name + " " + "It is your chance now enter you answer:");
                        player1.answer = input.nextLine();
                        player2.Points -= 10;
                        if (player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player1.Points -= 10;
                        }
                    }

                } else if (player1.FirsttoPlay == true) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                    System.out.println(player1.name + " " + "Enter your answer:");
                    player1.answer = input.nextLine();
                    System.out.println(player1.answer);
                    if (player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        gameround++;
                        break;
                    } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player2.name + " " + "It is your chance now enter you answer:");
                        player2.answer = input.nextLine();
                        player1.Points -= 10;
                        if (player2.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player2.Points -= 10;
                        }
                    }
                }
            }
            System.out.println(player1.name + " " + "have" + player1.Points + " " + player2.name + " " + "have" + player2.Points + " ");
        } else if (gameround == 1) {
            movie.SetAMovie();
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {

                if (player2.FirsttoPlay == true) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                    System.out.println(player2.name + " " + "Enter your answer:");
                    player2.answer = input.nextLine();
                    if (player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        gameround++;
                        break;
                    } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player1.name + " " + "It is your chance now enter you answer:");
                        player1.answer = input.nextLine();
                        player2.Points -= 10;
                        if (player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player1.Points -= 10;
                        }
                    }
                } else if (player1.FirsttoPlay == true) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                    System.out.println(player1.name + " " + "Enter your answer:");
                    player1.answer = input.nextLine();
                    System.out.println(player1.answer);
                    if (player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        gameround++;
                        break;
                    } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player2.name + " " + "It is your chance now enter you answer:");
                        player2.answer = input.nextLine();
                        player1.Points -= 10;
                        if (player2.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player2.Points -= 10;
                        }
                    }
                }
            }
            System.out.println(player1.name + " " + "have" + player1.Points + " " + player2.name + " " + "have" + player2.Points + " ");
        }
            else if (gameround == 2) {
            movie.SetAMovie();
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {

                if (player2.FirsttoPlay == true) {
                    System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                    System.out.println(player2.name + " " + "Enter your answer:");
                    player2.answer = input.nextLine();
                    if (player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("Good guess!!");
                        gameround++;
                        break;

                    } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                        System.out.println("your answer in not correct" + "\n" + player1.name + " " + "It is your chance now enter you answer:");
                        player1.answer = input.nextLine();
                        player2.Points -= 10;
                        if (player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Both answers are wrong");
                            player1.Points -= 10;
                        }
                    }
                }
                    else if (player1.FirsttoPlay == true) {
                        System.out.println("Guess the movie name by hint : " + " " + movie.hints[i]);
                        System.out.println(player1.name + " " + "Enter your answer:");
                        player1.answer = input.nextLine();
                        System.out.println(player1.answer);
                        if (player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("Good guess!!");
                            gameround++;
                            break;
                        } else if (!player1.answer.equalsIgnoreCase(movie.name)) {
                            System.out.println("your answer in not correct" + "\n" + player2.name + " " + "It is your chance now enter you answer:");
                            player2.answer = input.nextLine();
                            player1.Points -= 10;
                            if (player2.answer.equalsIgnoreCase(movie.name)) {
                                System.out.println("Good guess!!");
                                gameround++;
                                break;
                            } else if (!player2.answer.equalsIgnoreCase(movie.name)) {
                                System.out.println("Both answers are wrong");
                                player2.Points -= 10;
                            }
                        }

                    }


                }

            System.out.println(player1.name + " " + "have" + player1.Points + " " + player2.name + " " + "have" + player2.Points + " ");
        } else {
            System.out.println(player1.name + " " + "have" + player1.Points + " " + player2.name + " " + "have" + player2.Points + " ");
        }

    }
}





