
public class DebitCard extends Card
{
	private static int fLastDebitCardNumber;
	private CheckingAccount fAccountConnectedTo;
	private int fDebitCardNumber;
	
	CustomerDetails cust_obj = null;
	
	public DebitCard(CustomerDetails cust_obj)
    {
            super(cust_obj);
            fDebitCardNumber = fLastDebitCardNumber;
            fLastDebitCardNumber++;
    }
    
    public DebitCard(CustomerDetails cust_obj, double limit, CheckingAccount account)
    {
            super(cust_obj);
            fDebitCardNumber = fLastDebitCardNumber;
            fLastDebitCardNumber++;
            fAccountConnectedTo = account;
    }
	
	public boolean pay(double amount)
	{
		if((fAccountConnectedTo.getBalance() - amount) < -fAccountConnectedTo.getDebitAmount())
		{
			fAccountConnectedTo.setBalance(fAccountConnectedTo.getBalance() - amount);
			return true;
		}
		else
		{
			return false;
		}
	}

}
