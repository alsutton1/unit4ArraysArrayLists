public class BoundsError
{
    public static void main(String[] args)
    {
        int[] score = new int[10];
        for (int i = 1; i <= 10; i++)
        {
            score[score.length - 1 - 1] = i+1;
        }
    }
}
