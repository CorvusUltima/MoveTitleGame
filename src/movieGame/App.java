package movieGame;

public class App {
    public static void main(String[] args) {

        RandomMovie playerSelection = new RandomMovie();
        playerSelection.Players();


        String randomSelection = playerSelection.randomMovie();


        System.out.println(randomSelection);



    }
}
