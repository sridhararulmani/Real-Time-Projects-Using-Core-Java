package userServer;
import accountCreationServer.*;
import featuresUsingServer.*;
import java.util.Scanner;
import java.util.Random;
public class User {

	public void toCreateAccount(Scanner sc,Random rd,AccountCreationServer aCS) {
			System.out.println("Rigister Account Holder Full Name");
			String accountHolderName=sc.next();

			System.out.println("Rigister Account Holder Mobile Number");
			long accountHolderMobileNumber=sc.nextLong(10);

			long generatedAccountNumber=rd.nextLong(898767665634245l, 9867656456325748l);

			aCS.createYourNewAccount(generatedAccountNumber,accountHolderName,accountHolderMobileNumber);
	}

	public void toGetAccountInfo(AccountCreationServer aCS) {
		aCS.getAccountInfo();	
	}

	//	MAIN METHOD
	public static void main(String[] args) {

		//		OBJECT CREATION
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();

		User u=new User();

		//		UPCASTIN DOWNCASTING
		//		1
		AccountCreation aC=new AccountCreationServer();
		AccountCreationServer aCS=(AccountCreationServer)aC;
		//		2
		FeaturesUsing fU=new FeaturesUsingSever();
		FeaturesUsingSever fUS=(FeaturesUsingSever)fU;

		int choiseToCreateNewAccount=rd.nextInt(1,4);
		int choiseToGetAccountInfo=rd.nextInt(4,8);

		System.out.println("Press "+choiseToCreateNewAccount+" to Create You New Account");

		System.out.println("Press "+choiseToGetAccountInfo+" to Get Your Accoun Details");

		int myChoise=sc.nextInt();

		switch(myChoise) {
		myChoise=choiseToCreateNewAccount;
		case choiseToCreateNewAccount:
			
			u.toCreateAccount(sc, rd, aCS);
			System.out.println("1");
			break;
		case 2:
			myChoise=choiseToGetAccountInfo;
			u.toGetAccountInfo(aCS);
			System.out.println("2");
			break;
		}


	}
}