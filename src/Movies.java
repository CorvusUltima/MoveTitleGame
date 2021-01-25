public class Movies {

   String name;
   String hint1;
   String hint2;
   String hint3;
   String hint4;
   String hint5;

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
         hint1="Mile";
         hint2="Mile";
         hint3="Mile";
         hint4="Mile";
         hint5="Mile";

      }

      if(str=="Godfather")
      {
         name="Godfather";
         hint1="Mile";
         hint2="Mile";
         hint3="Mile";
         hint4="Mile";
         hint5="Mile";

      }
      if(str=="Matrix")
      {

         name ="Matrix";
         hint1="Mile";
         hint2="Mile";
         hint3="Mile";
         hint4="Mile";
         hint5="Mile";


      }
      if(str=="Fight Club")
      {
   name="Fight Club";
         hint1="Mile";
         hint2="Mile";
         hint3="Mile";
         hint4="Mile";
         hint5="Mile";

      }
      if(str=="Goodfellas")
      {
    name="GoodFellas";
         hint1="Mile";
         hint2="Mile";
         hint3="Mile";
         hint4="Mile";
         hint5="Mile";
      }



   }



}
