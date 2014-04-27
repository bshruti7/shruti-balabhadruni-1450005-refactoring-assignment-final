public class GenericAccount {
	protected int fAccountNumber;
	protected String fName;
	protected String fStreet;
	protected String fZipcode;
	protected String fTown;
	protected String fCountry;
	protected double fBalance;
	
	 CustomerDetails cust_obj = null;

	

	 public GenericAccount(CustomerDetails cust_obj){
         this.fName = cust_obj.getfName();
         this.fStreet = cust_obj.getfStreet();
         this.fZipcode = cust_obj.getfZipCode();
         this.fTown = cust_obj.getfTown();
         this.fCountry = cust_obj.getfCountry();
         
         
 }
	public GenericAccount(double fBalance) {
		super();
		this.fBalance = fBalance;
	}
	public GenericAccount(int accountnumber)
	{
		fAccountNumber = accountnumber;
	}

	public void print() {
		System.out.println("**************************************");
		System.out.println("Account:     " + fAccountNumber);
		System.out.println("Account holder name: " + fName);
		System.out.println("Address:             " + fStreet);
		System.out.print("                     " + fZipcode);
		System.out.println(" " + fTown);
		System.out.println(fCountry.toUpperCase());
		System.out.println("**************************************");
		
		System.out.println("Balance:  " + fBalance);
		System.out.println("**************************************");
	}

	public double getfBalance() {
		return fBalance;
	}

	public void setfBalance(double fBalance) {
		this.fBalance = fBalance;
	}
	public void verseMoney(double amount) {
		fBalance += amount;
	}

}