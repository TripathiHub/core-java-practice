public class CWHPRATICESET6Q7
{
    public static void main(String[] args) {
        int[] arr = {89, 67, -45, 89, 34};
        int min = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }
            System.out.print("the minimun value in array is :");
            System.out.println(min);

    }
}
