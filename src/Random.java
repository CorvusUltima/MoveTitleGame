import java.util.Vector;

public class Random {



    // Function to generate random numbers
    static void lcm(int seed, int mod, int multiplier,
                    int inc, int[] randomNums,
                    int noOfRandomNum)
    {

        // Initialize the seed state
        randomNums[0] = seed;

        // Traverse to generate required
        // numbers of random numbers
        for (int i = 1; i < noOfRandomNum; i++) {

            // Follow the linear congruential method
            randomNums[i]
                    = ((randomNums[i - 1] * multiplier) + inc)
                    % mod;
        }
    }

    static Vector <Integer> rng(int seed, int m, int multi, int inc, int[] randomN, int nMax)
    {
        Vector<Integer> vec=new Vector<>();

        for (int i = 1; i < nMax; i++) {
            randomN[i] = ((randomN[i - 1] * multi) + inc) % m;
            vec.add((randomN[i - 1]) );
        }

        return vec;

    }


     static void RNG(long seed, long m, long multi, long inc, long[] randomN, int nMax)
    {
        long time = System.currentTimeMillis();
        seed*= time;
        randomN[0] = seed;
        for (int i = 1; i < nMax; i++) {
            randomN[i] = ((randomN[i - 1] * multi) + inc) % m;
        }
    }

}
