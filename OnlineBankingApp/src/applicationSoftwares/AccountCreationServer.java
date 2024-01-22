package applicationSoftwares;

public class AccountCreationServer implements AccountCreation{

	long accountNumber;
	String accountHolderName;
	double balance;
	
	public AccountCreationServer(long accountNummber,String accountHolderName,double balance) {
		this.accountNumber=accountNummber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	@Override
	public void accountCreation() {
		// TODO Auto-generated method stub
		
	}

}
