public class CWHpraticeset6q2
{
    public static void main(String[] args)
    {
        float [] marks = {90.0f,78.9f,67.56f,80.78f,90.0f};
        float sum=0;
        for(float e: marks){
            sum = sum + e;
        }
        System.out.println(sum/marks.length);
    }
}
