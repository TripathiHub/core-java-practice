import java.util.Scanner;

public class CWHpraticeset3Q1
{
    public static void main(String[] args)
    {
        System.out.println("enter your favourite line :");
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        name= name.toLowerCase();
        System.out.println(name);
        name=name.replace(" ","_");
        System.out.println(name);
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        System.out.println(name.indexOf(" "));

    }
}
