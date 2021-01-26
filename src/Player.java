import java.util.concurrent.ThreadLocalRandom;

public class Player {


    String Name;
    boolean TurnToPlay;

    public static String Random() {
        int diceCast = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        if (diceCast == 1) {
            return "1";
        } else if (diceCast == 2) {
            return "2";
        } else if (diceCast == 3) {
            return "3";
        } else if (diceCast == 4) {
            return "4";
        } else if (diceCast == 5) {
            return "5";
        } else if (diceCast == 6) {
            return "6";
        } else return "Error";
    }
}




