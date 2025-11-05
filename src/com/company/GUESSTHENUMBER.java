package com.company;

import java.util.Random;
import java.util.Scanner;

class Game
{
    int mynum;
     public int randomNumber()
     {
       Random comnum =new Random();
        int randomNumber = comnum.nextInt(100);
        return randomNumber;
     }
      public void setNumber(int a)
        {
           mynum=a;
        }
     public int getNumber()
         {
         return mynum;
         }
}
public class GUESSTHENUMBER
{
    public static void main(String[] args)
    {   int c=0;
        int d=0;
        int numberofguess=0;
        System.out.println("Welcome to the game of 'GUESS A NUMBER' ");
        System.out.println("RULES: You have to guess number between 0-100.");
        System.out.println("How to play : ");
        System.out.println("1>> Computer has already picked a number. ");
        System.out.println("2>> Now you have to guess the number picked by computer in minimum attempts");
        System.out.println("Lets Start");
        Game player1= new Game();
        d = player1.randomNumber();
        for(int i=0;i<99;i++)
        {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            player1.setNumber(n);
            System.out.print("the number entered by you is: ");
            c = player1.getNumber();
            if(c>100)
            {
                System.out.println("Strictly Follow The Rules");
                System.out.println("PLAY AGAIN YOU IDIOT");
                break;
            }
            System.out.println(c);
           // System.out.print("the number entered by computer is : ");
           //  System.out.println(d);
            if (c == d)
            {
                System.out.println(" CONGRATULATIONS! YOU GUESSED IT RIGHT");
                numberofguess++;
                i++;
                break;
            }
           else if (c < d)
            {
                System.out.println("You enter a small value");
                numberofguess++;
                i++;
            }
          else if (c > d)
            {
                System.out.println("You enter a big value");
                numberofguess++;
                i++;
            }
        }
        System.out.print("Number of attemps :" );
        System.out.println(numberofguess);
        if(numberofguess==1)
        {
            System.out.println("BROO YOU ARE MASTER OF THIS GAME");
        }
        if(numberofguess<=3&&numberofguess>=2)
        {
            System.out.println(" WOW! YOU ARE A GOAT PLAYER");
        }
        if(numberofguess<=5&& numberofguess>=4)
        {
            System.out.println(" AMM! YOU ARE A GREAT PLAYER");
        }
        if(numberofguess<=7&&numberofguess>=6)
        {
            System.out.println("YOU ARE A GOOD PLAYER");
        }
        if(numberofguess>=8)
        {
            System.out.println("OOPS! YOU NEED TO IMPROVE YOUR NUMBER OF GUESSES ....PLAY AGAIN");
        }
    }
}
