package hottelServices;

import java.util.Scanner;

public class Menu extends OrderPage implements Vegtarien,NonVegitarien{	
	Menu m=(Menu)o;
	static void vegAbdNonVeg() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for Veg");
		System.out.println("Enter 2 for Non-Veg");
		int Choise=sc1.nextInt();
		if(Choise==1) {
			m.nonVeg();
		}
		else if (Choise==2) {
			m.nonVeg();
		}
		else {
			System.out.println("Here Veg & Non-Veg Only Available");
		}
	}
	@Override
	public void nonVeg() {
		System.out.println("Non-Veg");
	}
	@Override
	public void veg() {
		System.out.println("Veg");
	}
}