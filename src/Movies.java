public class Movies {

   String name;

   String[] hints=new String[5];

   boolean Inception=false;
   boolean Godfather=false;
   boolean Matrix=false;
   boolean FightClub=false;
   boolean Goodfellas=false;


    void SetAMovie() {
      String str=MoveTitleGame.randomise();

      // Movies movies=new Movies();

      if(str=="Inception")
      {
         name="Inception";
         hints[0]="Mile1";
         hints[1]="Mile2";
         hints[2]="Mile3";
         hints[3]="Mile4";
         hints[4]="Mile5";

      }

      if(str=="Godfather")
      {
         name="Godfather";
          hints[0]="Mile1";
          hints[1]="Mile2";
          hints[2]="Mile3";
          hints[3]="Mile4";
          hints[4]="Mile5";

      }
      if(str=="Matrix")
      {

         name ="Matrix";
          hints[0]="Mile1";
          hints[1]="Mile2";
          hints[2]="Mile3";
          hints[3]="Mile4";
          hints[4]="Mile5";


      }
      if(str=="Fight Club")
      {
   name="Fight Club";
          hints[0]="Mile1";
          hints[1]="Mile2";
          hints[2]="Mile3";
          hints[3]="Mile4";
          hints[4]="Mile5";

      }
      if(str=="Goodfellas")
      {
    name="GoodFellas";
          hints[0]="Mile1";
          hints[1]="Mile2";
          hints[2]="Mile3";
          hints[3]="Mile4";
          hints[4]="Mile5";
      }



   }



}
