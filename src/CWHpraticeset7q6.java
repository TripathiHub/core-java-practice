public class CWHpraticeset7q6
{
    static int avg(int ...arr)
    {
    int sum=0;
    for( int a: arr)
    {
        sum=sum+a;
    }
    return sum;
    }
    public static void main(String[] args)
    {
        int result=0;
        result =avg(56,67,78);
        float average = result/3.0f;
        System.out.println(average);
    }
}
