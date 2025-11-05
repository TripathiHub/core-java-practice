public class CWHPRATICESET7Q10
{   static int sum(int n){
     int sum=0;
    for(int i=0;i<n;i++){
      sum =sum +i+1;
    }
    return sum;
}
    public static void main(String[] args)
    {
        int c=0;
        c=sum(9);
        System.out.println(c);
    }
}
