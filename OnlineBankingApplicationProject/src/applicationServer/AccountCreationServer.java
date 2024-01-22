package applicationServer;

import userPackage.User;

public class AccountCreationServer extends User implements AccountCreationFeatures{
	
	User u=new User();
	
	long accountNumber;
	String accountHolderName;
	double balance;
	
	@Override
	public long accountCreation(long accountNumber) {
		return accountNumber;
	}
	
	
	public void getAccountInfo() {
		this.accountNumber=u.accountNUmber;
		System.out.println(accountNumber);
	}
}