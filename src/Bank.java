import java.util.Vector;


public class Bank 
{
	private String fName;
	private Vector<CheckingAccount> fCheckingAccounts;
	private Vector<SavingsAccount> fSavingAccounts;
	
	public Bank(String name)
	{
		fName = name;
		fCheckingAccounts = new Vector<CheckingAccount>();
		fSavingAccounts = new Vector<SavingsAccount>();
	}
	
	public int openSimpleCheckingAccount()
	{
		CheckingAccount newAccount = new CheckingAccount("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
		fCheckingAccounts.add(newAccount);
		newAccount.setBalance(4000);
		return newAccount.getAccountNumber();
	}
	
	public int openFullPackage()
	{
		
		int accountNumber = openSimpleCheckingAccount();
        CheckingAccount newAccount1 = new CheckingAccount(accountNumber);
		newAccount1.applyForCreditCard("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA", newAccount1.getAccountNumber());
		SavingsAccount newSavingsAccount = new SavingsAccount("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
		fSavingAccounts.add(newSavingsAccount);
		DebitCard newDebetCard = new DebitCard("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA", 0, newAccount1);
		return newAccount1.getAccountNumber();
	}
	
	public boolean withdrawMoney(int accountNumber, double amount)
	{
		GenericAccount account = new CheckingAccount(accountNumber);
		int index = fCheckingAccounts.indexOf(account);
		return fCheckingAccounts.elementAt(index).withdrawal(amount);
	}
	
}
