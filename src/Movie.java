import java.util.concurrent.ThreadLocalRandom;

public class Movie {

     String name;

     String[] hints=new String[5];

   public String randomise() {

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
    void SetAMovie() {
        String str = randomise();

        if (str.equals("Inception")) {
            name = "Inception";
            hints[0] = "Is a 2010 science fiction action film";
            hints[1] = "You musn't be afraid to dream a little bigger darling. ...";
            hints[2] = "Written and directed by Christopher Nolan";
            hints[3] = "Dominick \"Dom\" Cobb and Arthur are \"extractors\"";
            hints[4] = "The film stars Leonardo DiCaprio as a professional thief ";

        }

        if (str.equals("Godfather")) {
            name = "Godfather";
            hints[0] = "Revenge is a dish best served cold.";
            hints[1] = "Directed by Francis Ford Coppola,";
            hints[2] = "\"A friend should always underestimate your virtues and an enemy overestimate your faults.\" ...";
            hints[3] = "portrayal of the rise of the Corleone crime Family to power,";
            hints[4] = "I'm gonna make him an offer he can't refuse. ...";

        }
        if (str.equals("Matrix")) {

            name = "Matrix";
            hints[0] = "Is a 1999 American science fiction action film";
            hints[1] = "Bodies as an energy source";
            hints[2] = "Computer programmer Thomas Anderson";
            hints[3] = "Red or Blue pill";
            hints[4] = "Neo is chosen one ";


        }
        if (str.equals("Fight Club")) {
            name = "Fight Club";
            hints[0] = "The first soap was made from heroes' ashes,";
            hints[1] = "Project Mayhem";
            hints[2] = "Directed by David Fincher";
            hints[3] = "Starring Brad Pitt and Edward Norton";
            hints[4] = "He and Tyler are the same person,";

        }
        if (str.equals("Goodfellas")) {
            name = "GoodFellas";
            hints[0] = "“Jimmy was the kind of guy who rooted for the bad guy in movies.” ";
            hints[1] = "Is a 1990 American crime film directed";
            hints[2] = "The film stars Robert De Niro, Ray Liotta, Joe Pesci, ";
            hints[3] = "directed by Martin Scorsese";
            hints[4] = "Good :::?";

        }

    }
}