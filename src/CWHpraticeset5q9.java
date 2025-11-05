public class CWHpraticeset5q9
{
    public static void main(String[] args)
    {
        int sum=0;
        int n=8;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d is %d",n,i,n*i);
            System.out.println("\n");
            sum =sum+n*i;

        }
        System.out.println("sum of the answer is :");
        System.out.println(sum);
    }
}
