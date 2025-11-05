import java.util.Random;
import java.util.Scanner;

public class CWHFIRSTGAME
{
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO THE OF STONE , PAPER & SCISSOR");
        System.out.println("You have to enter any three of above for game with computer.\nGAME INSTRUCTIONS :\n0->stone\n1->paper\n2->scissor");
        int i=0;
        int you=0;
        int computer=0;
        while(i<5)
        {
            System.out.print("Its your turn let's start\nYour entered value is: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            Random ram = new Random();
            int randomnumber = ram.nextInt(2);
            System.out.print("Entry of computer: ");
            System.out.println(randomnumber);
            if (a == randomnumber) {
                System.out.println("Oops! match draws.\n");
            } else if (a == 0 && randomnumber == 2) {
                System.out.println("You win the match.\n");
                ++you;
            } else if (a == 0 && randomnumber == 1) {
                System.out.println("You lost the match.\n");
                ++computer;
            } else if (a == 1 && randomnumber == 2) {
                System.out.println("you lost the match.\n");
                ++computer;
            } else if (a == 1 && randomnumber == 0) {
                System.out.println("You win the match..\n");
                ++you;
            } else if (a == 2 && randomnumber == 1) {
                System.out.println("You win the match.\n");
                ++you;
            } else if (a == 2 && randomnumber == 0) {
                System.out.println("You lost the match.\n");
                ++computer;
            }
            if(a>2){
                System.out.println("PLAY the game FAIRLY and please READ THE GAME INSTRUCTIONS properly.");
                break;
            }
            ++i;
        }
        System.out.print("Your score of 5 match series is:");
        System.out.println(you);
        System.out.print("Score of computer in 5 match series is :");
        System.out.println(computer);
        if(you>computer){
            System.out.println("Congratulation! you have win the 5 match series with computer.");
        }
        if(computer>you){
            System.out.println("Opps! you have lost the 5 series with computer.\nYou should play again.");
        }
        if(you==computer){
            System.out.println("Oops! the series of 5 match has been drawed. PLEASE PLAY AGAIN");
        }
    }
}
