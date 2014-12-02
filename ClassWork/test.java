public class test
{
    public static void main(String[] args)
    {
        for (int x = 4; x > 1; x--)
        {
            for (int y = 0; y < x; y++)
            {
                if (x > 1)
                { 
                    System.out.print("[] ");
                }
            }
            System.out.println("");
        }
    }
}