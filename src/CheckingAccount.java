
public class CheckingAccount extends GenericAccount 
{
	int fAccountNumber;
	private boolean fDebitAllowed;
	private double fDebitAmount;
	double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double debitRate = 4.7;
	private static Card fCreditCard;
	private static SavingsAccount fSavingsAccount;
	private static DebitCard fDebitCard;
	private static int fNextAccountNumber = 0;
	CustomerDetails cust_obj = null;
    
    public CheckingAccount(CustomerDetails cust_obj)
    {
            super(cust_obj);
            fAccountNumber = fNextAccountNumber;
            fNextAccountNumber++;
            fDebitAllowed = false;
            fDebitAmount = 0;
            
    }
    
    public CheckingAccount(CustomerDetails cust_obj, float debit)
    {
            super(cust_obj);
            fAccountNumber = fNextAccountNumber;
            fNextAccountNumber++;
            fDebitAllowed = true;
            fDebitAmount = debit;
    }
	
	public CheckingAccount(int accountnumber)
    {
            super(accountnumber);
    }
	
	public void determineCosts()
	{
		fBalance = fBalance - costs;
		if(fBalance < 0)
		{
			fBalance = fBalance - (fBalance * debitRate / 100);
		}
	}
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0) && (!fDebitAllowed))
		{
			return false;
		}
		else if((amount - fBalance) < -fDebitAmount)
		{
			fBalance = fBalance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean applyForCreditCard(CustomerDetails cust_obj, int accountNumber)
    {
            if(fBalance < 0)
            {
                    return false;
            }
            if(fBalance <= 2500)
            {
                    fCreditCard = new CreditCard(cust_obj);
            }
            else
            {
                    fCreditCard = new CreditCard(cust_obj, 5000);
            }
            return true;
    }
    
	
	public double getBalance()
	{
		return fBalance;
	}
	
	
	
	public void decreaseBalance(double amount)
	{
		fBalance -= amount;
	}

	public double getDebitAmount()
	{
		return fDebitAmount;
	}

	public void setBalance(double amount)
	{
		fBalance = amount;	
	}

	public int getAccountNumber() 
	{
		return fAccountNumber;	
	}
	
	public boolean equals(Object o)
	{
		if(fAccountNumber == ((CheckingAccount)o).fAccountNumber)
			return true;
		else
			return false;
				
	}
}
