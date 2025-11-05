import java.util.Scanner;

public class drvingtest
{
    public static void main(String[] args)
    {
        System.out.println("enter your name and age in this squence only");
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        int age= sc.nextInt();
        if(age>=18)
        {
            System.out.printf(" Congratulations %s you can apply for lisence test. ",name);
        }
        else{
            System.out.printf("Sorry %s you are underage for application.",name);
        }




    }
}
