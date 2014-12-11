import java.util.ArrayList;

public class Store
{
    private ArrayList<String> customer;
    private ArrayList<Double> price;
    
    public void addSale(String customerName, double amount)
    {
        int lastNum = customer.size() - 1;
        customer.add(lastNum, customerName);
        price.add(lastNum, amount);
    }
    
    public String nameOfBestCostumer()
    {
        String valuedCustomer = "";
        double greatestValue = 0;
        for (int i = 0; i < price.size(); i++)
        {
            if (price.get(i) > greatestValue)
            {
                greatestValue = price.get(i);
                valuedCustomer = customer.get(i);
            }
        }
        return valuedCustomer;
    }
    
}
