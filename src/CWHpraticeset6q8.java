public class CWHpraticeset6q8
{
    public static void main(String[] args)
    {
        int [] marks= {78,90,56,76,99,100};
        boolean isItSort=true;
        for( int i=0;i<5;i++)
        {
            if(marks[i]>marks[i+1]);
            isItSort=false;
        }
        if(isItSort)
        {
            System.out.println("the array is sorted");
        }
        else
        {
            System.out.println("the array is not sorted");
        }
    }
}
