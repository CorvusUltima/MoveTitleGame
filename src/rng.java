import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class rng {



    static int rdm_int(int min, int max)
    {
         int rand = ThreadLocalRandom.current().nextInt(min, max + 1);
        return rand;
    }
    static float rdm_float(float min, float max)
    {
        Random r = new Random();
        float random = min +r.nextFloat() * (max - min);
        return random;
    }
    static boolean rdm_bool(float true_chance)
    {
        return rdm_float(0.0f, 100.0f) <= true_chance;
    }


}
