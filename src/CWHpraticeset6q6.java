public class CWHpraticeset6q6
{
    public static void main(String[] args)
    { int [] arr={45,667,869,34,67};
        int max= Integer.MIN_VALUE;
        for(int elements: arr)
        {
            if(elements>max)
            {
                max=elements;
            }
        }
        System.out.print("the maximum value is ");
        System.out.println(max);
    }
}
