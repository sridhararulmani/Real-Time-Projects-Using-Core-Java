package snakeAndLaderGameUsingSwitchCasemethodRandomLoop;
import java.util.*;
public class snakeAndLaderGame {
	static int flipDice(int count) {
		Random rd=new Random();
		int score=rd.nextInt(6)+1;
		System.out.println("Your Score form this flip "+score);
		if(count+score<=100) {
			count=count+score;
			switch(count) {
			case 1:
				count=38;
				System.out.println("Jumped  up to "+count);
				break;
			case 4:
				count=14;
				System.out.println("Jumped  up to "+count);
				break;
			case 9:
				count=31;
				System.out.println("Jumped  up to "+count);
				break;
			case 21:
				count=42;
				System.out.println("Jumped  up to "+count);
				break;
			case 28:
				count=84;
				System.out.println("Jumped  up to "+count);
				break;
			case 51:
				count=67;
				System.out.println("Jumped  up to "+count);
				break;
			case 72:
				count=91;
				System.out.println("Jumped  up to "+count);
				break;
			case 80:
				count=99;
				System.out.println("Jumped  up to "+count);
				break;
			case 17:
				count=7;
				System.out.println("Jumped  down to "+count);
				break;
			case 54:
				count=34;
				System.out.println("Jumped  down to "+count);
				break;
			case 62:
				count=19;
				System.out.println("Jumped  down to "+count);
				break;
			case 64:
				count=60;
				System.out.println("Jumped  down to "+count);
				break;
			case 87:
				count=36;
				System.out.println("Jumped  down to "+count);
				break;
			case 93:
				count=73;
				System.out.println("Jumped  down to "+count);
				break;
			case 95:
				count=75;
				System.out.println("Jumped  down to "+count);
				break;
			case 98:
				count=79;
				System.out.println("Jumped  down to "+count);
				break;
			}
		}
		System.out.println("Your's Total Score is "+count);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name your the First Player");
		String fplayer=sc.next();
		System.out.println("enter your name your the Second Player");
		String splayer=sc.next();
		int fcount=0,scount=0,count=0;
		while(true) {
			System.out.println(fplayer+" Press any Button tpo Roll the Dice");
			sc.next();
			fcount=flipDice(fcount);
			if(fcount==100) {
				System.out.println(fplayer+" Won the game");
				break;
			}
			System.out.println("------------------------------------------------");
			System.out.println(splayer+" Press any Button tpo Roll the Dice");
			sc.next();
			scount=flipDice(scount);
			if(scount==100) {
				System.out.println(splayer+" Won the game");
				break;
			}
			System.out.println("-------------------------------------------------");
		}
	}	
}