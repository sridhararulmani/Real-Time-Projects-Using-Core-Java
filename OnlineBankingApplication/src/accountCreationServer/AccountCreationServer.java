package accountCreationServer;

public class AccountCreationServer implements AccountCreation{

	//	INSTANCES
	long accountNumber;
	String accountHolderName;
	long accountHolderMobileNumber;
	
	@Override
	public void createYourNewAccount(long generatedAccountNumber, String accountHolderName,
			long accountHolderMobileNumber) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountHolderMobileNumber=accountHolderMobileNumber;
		System.out.println("---Your Account Successfully Created---");
	}
	
	public void getAccountInfo() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holer Name :"+accountHolderName);
		System.out.println("Account Holder Mobile Number :"+accountHolderMobileNumber);
	}
	
}