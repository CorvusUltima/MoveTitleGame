import java.util.Scanner;

public class Player {


    String name;
    boolean bFrstToPlay=false;
    int iDiceNum=0;
    String answer;
    void SetName()
    {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
    };


}
