package userPackage;
import java.util.Scanner;

import applicationServer.AccountCreationServer;

import java.util.Random;

public class User {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		
		User u=new AccountCreationServer();
		AccountCreationServer ac=(AccountCreationServer)u;
		
		int choiseToCreateNewAccount=rd.nextInt(1, 5);
		System.out.println("Press "+choiseToCreateNewAccount+" to Create New Account");
		int MyChoiseToCreateNewAccount=sc.nextInt();
		
		long generatedAccontNUmber=rd.nextLong(9745867635674l, 134665896776665739l);
		
		if(choiseToCreateNewAccount==MyChoiseToCreateNewAccount) {
			long accountNUmber=ac.accountCreation(generatedAccontNUmber);
//			System.out.println(ac.accountCreation(generatedAccontNUmber));
			ac.getAccountInfo();
		}
		
	}
}