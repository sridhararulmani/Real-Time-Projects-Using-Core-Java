package applicationSoftwares;
import java.util.Scanner;
import java.util.Random;
public class User {
	
	long accountNumber;
	String accountHolderName;
	double balance;
	
	//	MAIN METHOD
	public static void main(String[] args) {

		//		UPCASTING DOWNCASTING
		AccountCreation ac=new AccountCreationServer(generatedAccountNumber,accountHolderName,balance);
		AccountCreationServer acs=(AccountCreationServer)ac;

		Features f=new FeaturesServer();
		FeaturesServer fs=(FeaturesServer)f;

		//		DEFAULT OBJECT CREATION
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();

		int choiseToCreateNewAccount=rd.nextInt(1, 5);
		System.out.println("Press "+choiseToCreateNewAccount+" to Create New Account");
		int myChoiseToCreateNewAccount=sc.nextInt();
		
		
		if(choiseToCreateNewAccount==myChoiseToCreateNewAccount) {

		}

	}
}