public class CWHPRATICESET6Q3
{
    public static void main(String[] args)
    {
        int [] marks ={90,87,89,67,88};
        int a=88;
        boolean isInArray = false;
        for(int e:marks)
        {
            if (e == a)
            {
                isInArray = true;
            }
        }
            if(isInArray)
            {
                System.out.println("the given number is in array");
            }
            else
            {
                System.out.println("the given number is not in array");
            }


    }

}
