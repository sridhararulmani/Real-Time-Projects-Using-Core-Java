package hottelServices;
import java.util.Scanner;
public class OrderPage {
	public static OrderPage taitel() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Menu");
		System.out.println("Enter 2 for Ratings");
		System.out.println("Enter 3 for About");
		int choise=sc.nextInt();
		OrderPage o=new OrderPage();
		if(choise ==1) {
			Menu m=new Menu();
			return m;
		}
		else if(choise==2) {
			Ratings r=new Ratings();
			return r;
		}
		else  if(choise==3) {
			About a=new About();
			return a;
		}
		else {
			System.out.println("There No More Options are Available");
		}
		return null;
	}
	public static void main(String[] args) {
		taitel();
	}
}