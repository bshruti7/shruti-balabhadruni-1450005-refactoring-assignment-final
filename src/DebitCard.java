
public class DebitCard extends Card
{
	private static int fLastDebitCardNumber;
	private CheckingAccount fAccountConnectedTo;
	private int fDebitCardNumber;
	
	
	
	public DebitCard(String name, String street, String town, String zipCode, String country)
	{
		super(name,street,town,zipCode,country);
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
	}
	
	public DebitCard(String name, String street, String town, String zipCode, String country, double limit, CheckingAccount account)
	{
		super(name,street,town,zipCode,country);
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
