import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Movies {

    String name;

    String[] hints=new String[5];

    static ArrayList<String> movieList = new ArrayList<>();

    void setAMovie() {

      if(name.equals("Godfather"))
      {
         name ="Godfather";
          hints[0]="Revenge is a dish best served cold.";
          hints[1]="Directed by Francis Ford Coppola,";
          hints[2]="\"A friend should always underestimate your virtues and an enemy overestimate your faults.\" ...";
          hints[3]="portrayal of the rise of the Corleone crime Family to power,";
          hints[4]="I'm gonna make him an offer he can't refuse. ...";

      }
      if(name.equals("Matrix"))
      {

         name ="Matrix";
          hints[0]="Is a 1999 American science fiction action film";
          hints[1]="Bodies as an energy source";
          hints[2]="Computer programmer Thomas Anderson";
          hints[3]="Red or Blue pill";
          hints[4]="Neo is chosen one ";
   }
}

 static int getHint() {
     Random gH = new Random();

     int result = gH.nextInt(5);

   return result; }

}
