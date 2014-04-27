
public class CreditCard extends Card 
{
	private static int fLastCreditCardNumber;
	private int fAccountConnectedTo;
	private int fCreditCardNumber;
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	
	public CreditCard(String name, String street, String town, String zipCode, String country)
	{
		super(name,street,town,zipCode,country);
		fLimit = 2500; // standard limit
		fBalance = 0;
	}
	
	public CreditCard(String name, String street, String town, String zipCode, String country, double limit)
	{
		super(name,street,town,zipCode,country);
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
