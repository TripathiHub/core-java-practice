import java.util.Scanner;

public class CWHpraticeset4q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks of physics: ");
        int a=sc.nextInt();
        System.out.print("enter marks of chemistry: ");
        int b =sc.nextInt();
        System.out.print("enter marks of maths: ");
        int c = sc.nextInt();
        float avg =(a+b+c)/3.0f;
        if(avg>=40&&a>=33&&b>=33&&c>=33)
        {
            System.out.println("Congratulations! you are PROMOTED");
        }
        else{
            System.out.println("Sorry! you are NOT PROMOTED");
        }
    }
}
