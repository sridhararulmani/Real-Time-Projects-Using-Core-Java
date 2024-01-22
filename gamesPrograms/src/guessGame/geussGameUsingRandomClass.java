package guessGame;
import java.util.*;
public class geussGameUsingRandomClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int count=0;
		while(true) {
			System.out.println("Guess any number between 0 to 9");
			int a=sc.nextInt();
			int b=rd.nextInt(10);
			count++;
			if(a==b) {
				System.out.println("*****You win the game*****");
				System.out.println("you take "+count+" Chances");
				System.out.println("--------------------------");
				break;
			}
			else {
				System.out.println("You lost the game");
				System.out.println("The number is "+b);
			}
		}
	}
}