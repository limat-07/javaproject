package Flowcontrolstatements;
import java.util.Scanner;

public class Charactervariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		if(c1>='a' && c1<='z') {
			System.out.println("Alphabet");
		}
		else if(c1>='0' && c1<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special character");
		}
	}

}
