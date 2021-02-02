import java.util.concurrent.ThreadLocalRandom;

public class Movie {

    String name;
    String hints[]=new String[5];

    static String randomise() {

        String Inception = "Inception";
        String Godfather = "Godfather";
        String Matrix ="Matrix";
        String FightClub = "Fight Club";
        String Goodfellas = "Goodfellas";

        int rand = ThreadLocalRandom.current().nextInt(1, 5 + 1);

        if(rand==1)
        {
            return Inception;
        }
        else if(rand==2){
            return Godfather;
        }
        else if(rand==3){
            return Matrix;
        }
        else if(rand==4){
            return FightClub;
        }
        else if(rand==5){
            return Goodfellas;
        }
        else return "Error in Random method";

    }

}