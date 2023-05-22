package Flowcontrolstatements;
import java.util.Scanner;
public class colourdetect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch (c) {
		case 'B':
			System.out.println("Blue");
			break;
		case 'R':
			System.out.println("red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("yellow");
			break;
		case 'W':
			System.out.println("white");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("Invalid code");
		
		}
	}

}
