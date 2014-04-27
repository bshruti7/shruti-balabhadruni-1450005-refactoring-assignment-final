
public class CreditCard extends Card 
{
	private static int fLastCreditCardNumber;
	private int fAccountConnectedTo;
	private int fCreditCardNumber;
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	CustomerDetails cust_obj = null;
    
    public CreditCard(CustomerDetails cust_obj)
    {
            super(cust_obj);
            fLimit = 2500; // standard limit
            fBalance = 0;
    }
    
    public CreditCard(CustomerDetails cust_obj, double limit)
    {
            super(cust_obj);
            fLimit = limit;
            fBalance = 0;
    }
    
	
	public boolean pay(double amount)
	{
		if((fBalance - amount) < -fLimit)
		{
			fBalance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
}
