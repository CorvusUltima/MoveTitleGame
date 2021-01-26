import java.util.concurrent.ThreadLocalRandom;
public class Player {


    String Name;
    boolean TurnToPlay;

    public static int Random() {
        int diceCast = ThreadLocalRandom.current().nextInt(1, 6 + 1);
      return diceCast;
    }


    public static void PlayerName(String name, int num) {
        System.out.println("Player" + " " + num + " " + "is on the turn");
    }
}




