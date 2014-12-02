public class Array2D
{
    private int x;
   
    int[][] table = 
    {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9},
       {10, 11, 12}
    };
    
    public void Array2D()
    {}
      
    public String toString()
    {
        String str = "";
        
        for (int rows = 0; rows < table.length; rows++)
        {
            for (int cols = 0; cols < table[rows].length; cols++)
            {
                str += table[rows][cols] + "\t";
            }
            str += "\n";
        }
        return str;
    }
    
    public String extractRow(int rows)
    {
        String str = "";
        for (int val : table[rows])
        {
            str += val + "\t";
        }
        return str;
    }
    
    public String extractCol(int cols)
    {
        String str = "";
        
        for (int rows = 0; rows < table.length; rows++)
        {
            str += table[rows][cols] + "\t";
        }
        return str;
    }
    
    public static void main(String[] args)
    {
        Array2D table = new Array2D();
        System.out.println(table.toString());
        System.out.println(table.extractRow(1));
        System.out.println(table.extractCol(1));
    }
}
        