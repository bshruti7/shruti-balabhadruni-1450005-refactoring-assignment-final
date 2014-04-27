
public class SavingsAccount extends GenericAccount {
	private int fAccountNumber;
	
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double interestRate = 1.25;
	private static int fNextAccountNumber = 0;
	CustomerDetails cust_obj = null;
    
    public SavingsAccount(CustomerDetails cust_obj)
    {
            super(cust_obj);
            fAccountNumber = fNextAccountNumber;
            fNextAccountNumber++;
    }
	
	public void calculateInterest()
	{
		fBalance = fBalance + (fBalance * interestRate / 100);
	}
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0))
		{
			return false;
		}
		else
		{
			fBalance = fBalance - amount;
			return true;
		}
	}
	
	
}
