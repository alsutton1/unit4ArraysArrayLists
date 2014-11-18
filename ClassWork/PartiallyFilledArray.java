public class PartiallyFilledArray
{
    private int[] values;
    private int currentSize;
    
    public PartiallyFilledArray()
    {
        this.values = new int[10];
        this.currentSize = 0;
    }
    
    public String toString()
    {
        String str = "[ ";
        
        for (int i = 0; i < this.currentSize; i++)
        {
            if (i > 0)
            {
                str += ", ";
            }
            str += this.values[i];
        }
        str += " ]";
        return str;
    }
    
    public void fillsRandom(int numberOfElements, int MAX)
    {
        for (int i = 0; i < numberOfElements; i++)
        {
            this.values[i] = (int)(Math.random() * MAX);
            this.currentSize++;
        }
    }
    
    public void removeIndexElement(int index)
    {
        this.values[index] = this.values[this.currentSize];
        this.currentSize--;
    }
    
    public void swapElements(int index1, int index2)
    {
        int valueTemp = this.values[index1];
        this.values[index1] = this.values[index2];
        this.values[index2] = valueTemp;
    }
    
    public void insertElement(int value)
    {
        if (this.currentSize == this.values.length)
        {
            growArray();
        }
        this.values[currentSize] = value;
        currentSize--;
    }
    
    private void growArray()
    {
        int newSize = this.values.length * 2;
        int[] newArray = new int[newSize];
        for (int i = 0; i < this.values.length; i++)
        {
            newArray[i] = this.values[i];
        }
        this.values = newArray;
    }
}
            