import java.security.cert.X509Certificate;

public class praitceofmethod
{
    static int sum(int x,int y){
       int z=0;
        if (x > y) {
            z=(x+y)*5;
        }
        else{
            z=x+y;
        }return z;
    }
    public static void main(String[] args)
    {   int c=0;
        int d=0;
        int e=0;
        
        c=sum(3,4);
        d=sum(5,6);
        e=sum(1,2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}
