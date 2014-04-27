public class GenericAccount {
	protected int fAccountNumber;
	protected String fName;
	protected String fStreet;
	protected String fZipcode;
	protected String fTown;
	protected String fCountry;
	
	public GenericAccount(String fName, String fStreet, String fZipcode,
			String fTown, String fCountry) {
		super();
		this.fName = fName;
		this.fStreet = fStreet;
		this.fZipcode = fZipcode;
		this.fTown = fTown;
		this.fCountry = fCountry;
	}
	
	public GenericAccount(int accountnumber)
	{
		fAccountNumber = accountnumber;
	}

	

}