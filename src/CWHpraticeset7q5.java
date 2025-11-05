public class CWHpraticeset7q5
{
    static int fab(int n)
    {
        if(n==1){
            return 0;
        }
   if(n==2)
     {
       return 1;
     }
   else
     {
       return fab(n-1) +fab(n-2);
     }
   }
    public static void main(String[] args)
    {  int c=0;
      c =fab(7);
        System.out.println(c);
    }
}
