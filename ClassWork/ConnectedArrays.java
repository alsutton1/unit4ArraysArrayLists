public class ConnectedArrays
{
   public static void main(String[] args) {
      int[] scores = {10,9,7,4,5};
      int[] values = scores;
      scores[3] = 10;
      System.out.println(values[3]);
   }
}