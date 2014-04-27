
public class SavingsAccount extends GenericAccount {
	private int fAccountNumber;
	
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double interestRate = 1.25;
	private static int fNextAccountNumber = 0;
	
	public SavingsAccount(String name, String street, String zipCode, String town, String country)
	{
		super(name,street,zipCode,town,country);
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
	
	public void verseMoney(double amount)
	{
		fBalance += amount;
	}
	
	
}
