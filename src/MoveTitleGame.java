

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MoveTitleGame {
     static int MatchGame=2;
     static int player1Points=0;
     static int player2Points=0;
     static int maxPoints=30;

        public static void main(String[] args){

        //nova Grana samo za mene


           String answer;
            Player player1=new Player();
            Player player2=new Player();
            PlayerNames(player1,player2);

        for (int i=0;i<MatchGame;i++)
        {
            Movies movies = new Movies();
            StartMovieGame(player1,player2, movies);

        }
        if (player1Points>player2Points)
        {
            System.out.print("Congratulations "+"\t"+player1.Name+"is victorious ");

        }
        else if(player2Points>player1Points)
        {
            System.out.print("Congratulations "+"\t"+player2.Name+"is victorious ");
        }
        else if(player2Points==player1Points)
        {
            System.out.print(" DRAW");
        }


        }

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

        public static void FirstToPlay(Player player1,Player player2)
        {
       System.out.print(player1.Name+"\t"+"\n" + "it's your turn to roll the dice good luck"+"\n");
       pressAnyKeyToContinue();
       player1.diceNum=DiceCast();
       System.out.print(player1.Name+"\t"+"your dice cast is "+"\t"+player1.diceNum+"\n");

       System.out.print(player2.Name+"\t"+"it's your turn to roll the dice good luck"+"\n");
       pressAnyKeyToContinue();
       player2.diceNum=DiceCast();
       System.out.print(player2.Name+"\t"+"your dice cast is"+"\t"+player2.diceNum+"\n");


       if (player1.diceNum>player2.diceNum)
       {
           player1.FrstToPlay=true;
           System.out.print(player1.Name+"\t"+"\n" + "Congratulations, you have the right to guess first"+"\n");
       }
       else if(player1.diceNum<player2.diceNum)
       {
           player2.FrstToPlay=true;
           System.out.print(player2.Name+"\t"+"\n" +
                   "Congratulations, you have the right to guess first"+"\n");
       }
       else if(player1.diceNum== player2.diceNum)
       {
           System.out.print("\n" + "Draw, let's go one more time. "+"\n");

           FirstToPlay( player1, player2);
       }
       }

       public static int DiceCast()
        {
           int rand = ThreadLocalRandom.current().nextInt(1, 5 + 1);
           return rand;
       }

       public static void  StartMovieGame(Player player1,Player player2, Movies movies)
        {

    movies.SetAMovie();
    System.out.print("\n" + "this is a quess movie game,"+"\n"+"first played by the player who gets the higher number on the dice"+"\n");
    pressAnyKeyToContinue();
    FirstToPlay(player1,player2);
    System.out.print("\n" + "It's time to guess"+"\n");
    pressAnyKeyToContinue();
    playingOrder(player1,player2,movies);







}

       public static void pressAnyKeyToContinue()
        {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

        public static void playingOrder(Player player1,Player player2,Movies movies)
        {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

       if(player1.FrstToPlay)
       {
           for(int i=0;i<5;i++,maxPoints-=5)
           {
           System.out.print(player1.Name+"\t"+"is a first to play"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player1.Name+"\t"+"Type your answer"+"\n");
           player1.Answer = input.nextLine();

           if ( player1.Answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("\n" + "Congratulations, the answer is correct ");
               player1Points+=maxPoints;
               System.out.print(player1.Name+"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
               break;
           }

           else { System.out.print( player2.Name+"\t"+" now is your turn"+"\n");
               System.out.print(player2.Name+"\t"+"Type your answer"+"\n");
               player2.Answer = input.nextLine();
               if ( player2.Answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct ");
                   player2Points+=maxPoints;
                   System.out.print(player2.Name+"\t"+"now have "+"\t"+player2Points+"\t"+"points"+"\n");
                   break;

               }
           }


             }

       }
        else if(!player1.FrstToPlay)
       {
                  for(int i=0;i<5;i++)

           {
           System.out.print(player2.Name+"is a first to play"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player2.Name+"\t"+"Type your answer"+"\n");
           player2.Answer = input.nextLine();

           if (player2.Answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("Congratulations, the answer is correct ");
               player2Points+=maxPoints;
               System.out.print(player2.Name+"\"\\t\"+now have "+"\t"+player2Points+"\t"+"points");
               break;
           }

           else {
               System.out.print( player1.Name+"\t"+" your turn to shoot "+"\n");
               System.out.print(player1.Name+"\t"+"Type your answer"+"\n");
               player1.Answer = input.nextLine();

               if ( player1.Answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct "+"\n");
                   player1Points+=maxPoints;
                   System.out.print(player1.Name+"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
                   break;
               }

           }
           }

       }
    }
       public static void PlayerNames(Player player1,Player player2){
           Scanner input = new Scanner(System.in);
           System.out.print("player 1 name:"+"\n");
           player1.Name = input.nextLine();
           System.out.print("player 2 name:"+"\n");
           player2.Name = input.nextLine();
       }

    public static void gui()
    {

        BorderLayout borderlayout = new BorderLayout();

        JFrame frame = new JFrame("Movie Game For Jensen Team Project");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel p2 = new Panel();
        p2.setLayout(new BorderLayout());
        p2.add(new Label("Player 1"), BorderLayout.WEST); //player 1 label
        p2.add(new Label("Player 2"), BorderLayout.EAST); //player 2 label
        p2.add(new Label("MOVIE GAME"), BorderLayout.NORTH );
        p2.setBackground(new Color(156, 93, 82));
        p2.setFont(new Font("sansserif", Font.BOLD, 18));
        frame.add(p2);
        JLabel player1Lbl = new JLabel("Player 1");
        p2.add(player1Lbl, BorderLayout.WEST);
        String player1Name = JOptionPane.showInputDialog("Player 1 enter your name");
        player1Lbl.setText(player1Name);


    }



}
