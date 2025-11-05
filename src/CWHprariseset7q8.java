public class CWHprariseset7q8
{   static void strpat(int n){
    if(n>0){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("");
    }
}
    public static void main(String[] args)
    {
   strpat(5);
    }
}
