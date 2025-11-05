public class CWHpraticeset6q5
{
    public static void main(String[] args)
    {
        int [] marks = {5,6,7,8,9};
        int l=marks.length;
        int temp=0;
        for(int i=0;i<l/2;i++)
        {
            temp =marks[i];
            marks[i]= marks[l-1-i];
            marks[l-1-i]=temp;
        }
        for(int e: marks)
        {
            System.out.println(e);
        }
    }
}
