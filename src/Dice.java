import java.util.Random;

public class Dice {

    private int numberOfSides = 6;

    private int dice2 = 5;

     public int rollDice() {

        int result;
        Random randomNumberGenerator = new Random();
        result = randomNumberGenerator.nextInt(numberOfSides) + 1;
        return result;
    }

    public int rollDice2() {

        int result;
        Random randomNumberGenerator = new Random();
        result = randomNumberGenerator.nextInt(dice2) + 1;
        return result;
    }
}