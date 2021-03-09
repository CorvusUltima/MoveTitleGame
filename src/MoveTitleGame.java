

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class MoveTitleGame {
     static String file_name="HS.txt";
     static int MatchGame=2;
     static int player1Points=0;
     static int player2Points=0;
     static int maxPoints=30;
     static int highScorePoints=0;




        public static void main(String[] args) throws IOException {


            Write HighScore=new Write(file_name,false);
            HighScore.ReadFile(file_name);


                String answer;
            Player player1=new Player();
            Player player2=new Player();
            PlayerNames(player1,player2);



        for (int i=0;i<MatchGame;i++)
        {
            Movies movies = new Movies();
            Movies movie0=movies;


            System.out.print("\n" + "this is a quess movie game,"+"\n"+
                    "first played by the player who gets the higher number on the dice"+"\n");
            StartMovieGame(player1,player2, movie0);

        }
        if (player1Points>player2Points)
        {
            System.out.println("Congratulations "+"\t"+player1.name+"is victorious ");
            if (player1Points>highScorePoints)
            {System.out.println("Congratulations "+"\t"+player1.name+"\t"+"set a new record  ");
                try {
                    HighScore.WriteToFile(player1.name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                HighScore.ReadFile(file_name);

            }

        }
        else if(player2Points>player1Points)
        {
            System.out.println("Congratulations "+"\t"+player2.name+"\t"+"is victorious ");
            if(player2Points>highScorePoints)
            {
                System.out.println("Congratulations "+"\t"+player2.name+"\t"+"set a new record  ");
                try {
                    HighScore.WriteToFile(player1.name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                HighScore.ReadFile(file_name);


            }


        }
        else
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
       System.out.print(player1.name+"\t"+"\n" + "it's your turn to roll the dice good luck"+"\n");
       pressAnyKeyToContinue();
       player1.iDiceNum=DiceCast();
       System.out.print(player1.name+"\t"+"your dice cast is "+"\t"+player1.iDiceNum+"\n");

       System.out.print(player2.name+"\t"+"it's your turn to roll the dice good luck"+"\n");
       pressAnyKeyToContinue();
       player2.iDiceNum=DiceCast();
       System.out.print(player2.name+"\t"+"your dice cast is"+"\t"+player2.iDiceNum+"\n");


       if (player1.iDiceNum>player2.iDiceNum)
       {
           player1.bFrstToPlay=true;
           System.out.print(player1.name+"\t"+"\n" + "Congratulations, you have the right to guess first"+"\n");
       }
       else if(player1.iDiceNum<player2.iDiceNum)
       {
           player2.bFrstToPlay=true;
           System.out.print(player2.name+"\t"+"\n" +
                   "Congratulations, you have the right to guess first"+"\n");
       }
       else if(player1.iDiceNum== player2.iDiceNum)
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

       if(player1.bFrstToPlay)
       {
           for(int i=0;i<5;i++,maxPoints-=5)
           {
           System.out.print(player1.name+"\t"+"is a first to play"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player1.name+"\t"+"Type your answer"+"\n");
           player1.answer = input.nextLine();

           if ( player1.answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("\n" + "Congratulations, the answer is correct ");
               player1Points+=maxPoints;
               System.out.print(player1.name+"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
               break;
           }

           else { System.out.print( player2.name+"\t"+" now is your turn"+"\n");
               System.out.print(player2.name+"\t"+"Type your answer"+"\n");
               player2.answer = input.nextLine();
               if ( player2.answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct ");
                   player2Points+=maxPoints;
                   System.out.print(player2.name+"\t"+"now have "+"\t"+player2Points+"\t"+"points"+"\n");
                   break;

               }
           }


             }

       }
        else if(!player1.bFrstToPlay)
       {
                  for(int i=0;i<5;i++)

           {
           System.out.print(player2.name+"is a first to play"+"\n");
           System.out.print(movies.hints[i]+"\n");
           System.out.print(player2.name+"\t"+"Type your answer"+"\n");
           player2.answer = input.nextLine();

           if (player2.answer.toUpperCase().equals(movies.name.toUpperCase()))
           {
               System.out.print("\n");
               System.out.print("Congratulations, the answer is correct ");
               player2Points+=maxPoints;
               System.out.print(player2.name+"\"\\t\"+now have "+"\t"+player2Points+"\t"+"points");
               break;
           }

           else {
               System.out.print( player1.name+"\t"+" your turn to shoot "+"\n");
               System.out.print(player1.name+"\t"+"Type your answer"+"\n");
               player1.answer = input.nextLine();

               if ( player1.answer.toUpperCase().equals(movies.name.toUpperCase()))
               {
                   System.out.print("\n");
                   System.out.print("Congratulations, the answer is correct "+"\n");
                   player1Points+=maxPoints;
                   System.out.print(player1.name+"\t"+"now have "+"\t"+player1Points+"\t"+"points"+"\n");
                   break;
               }

           }
           }

       }
    }
       public static void PlayerNames(Player player1,Player player2){
           Scanner input = new Scanner(System.in);
           System.out.print("player 1 name:"+"\n");
           player1.name = input.nextLine();
           System.out.print("player 2 name:"+"\n");
           player2.name = input.nextLine();
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
