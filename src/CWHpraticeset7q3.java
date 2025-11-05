public class CWHpraticeset7q3
{
    static int sum(int n)
    {
    if(n==1)
        {
        return 1;
        }
        else
        {
            return n+ sum(n-1);
        }
    }

    public static void main(String[] args)
    { int c=0;
     c= sum(5);
        System.out.println(c);
    }
}
