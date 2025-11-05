public class CWHpraticeset7q7
{    static void strpat(int n){
    if(n>0){
        strpat(n-1);
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
    public static void main(String[] args)
    {
        strpat(5);
    }
}
