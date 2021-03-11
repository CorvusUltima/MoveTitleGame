import java.nio.file.Files;
import java.util.Scanner;

public class Player {

    String sName;
    boolean bFrstToPlay=false;
    int nDice =0;
    String answer;
    void SetName()
    {
        Scanner input = new Scanner(System.in);
        sName = input.nextLine();
    };
    static int DiceRoll()
    {
        return rng.rdm_int(1,5);  // method is defined in rng class;
    }


}
