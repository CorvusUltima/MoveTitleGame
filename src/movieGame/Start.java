package src.movieGame;

import java.util.concurrent.TimeUnit;

public class Start {
    public String Starting(){

        int timingTodisplay = 2;


        System.out.println("Welcome to Free Movie Ticket Game.");
        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thank you for choosing us!");
        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Read the following instructions carefully...");
        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("To get a Free Movie Ticket,you have to win 2 game levels.");
        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You must be 18 and up to 65 years to play.");

        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("If you win, print out your ticket then go watch the a movie for free.");
        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("If you wish to continue...");

        try {
            TimeUnit.SECONDS.sleep(timingTodisplay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Start your game now");


        return "";
    }

}
