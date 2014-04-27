import java.util.Vector;

//Hard coded values have to be removed - Bad smell
public class Bank 
{
        private String fName;
        private Vector<CheckingAccount> fCheckingAccounts;
        private Vector<SavingsAccount> fSavingAccounts;
        CustomerDetails cust_obj = new CustomerDetails("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
        
        public Bank(String name)
        {
                fName = name;
                fCheckingAccounts = new Vector<CheckingAccount>();
                fSavingAccounts = new Vector<SavingsAccount>();
        }
        
        public int openSimpleCheckingAccount()
        {
                
                CheckingAccount newAccount = new CheckingAccount(cust_obj);
                fCheckingAccounts.add(newAccount);
                newAccount.setBalance(4000);
                return newAccount.getAccountNumber();
        }
        
        public int openFullPackage()
        {
                                
                int accountNumber = openSimpleCheckingAccount();
                CheckingAccount newAccount1 = new CheckingAccount(accountNumber);
                newAccount1.applyForCreditCard(cust_obj, newAccount1.getAccountNumber());
                SavingsAccount newSavingsAccount = new SavingsAccount(cust_obj);
                fSavingAccounts.add(newSavingsAccount);
                DebitCard newDebetCard = new DebitCard(cust_obj, 0, newAccount1);
                return newAccount1.getAccountNumber();
        }
        
        public boolean withdrawMoney(int accountNumber, double amount)
        {
                GenericAccount account = new CheckingAccount(accountNumber);
                int index = fCheckingAccounts.indexOf(account);
                return fCheckingAccounts.elementAt(index).withdrawal(amount);
        }
        
}