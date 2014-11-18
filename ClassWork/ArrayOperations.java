public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] x = {8,4,5,21,7,9,18,2,100};
        
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);
        
        for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < x.length; i++)
        {
            int z = i+1;
            System.out.println("Value " + z + ": " + x[i]);
        }
        System.out.println("");
        for (int i = x.length; i > 0; i--)
        {
            System.out.println("Value " + i + ": " + x[i-1]);
        }
        
        for (int i : x)
        {
            System.out.println("Value " + i + ": " + x[i]);
        }
    }
}
