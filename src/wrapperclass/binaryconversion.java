package wrapperclass;
import java.util.*;
public class binaryconversion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number between 1 to 255 : ");
		int num =sc.nextInt();
		
		if(num <1 || num>255) {
			System.out.println("Invalid number");
		}
		else
		{
		String Binary =Integer.toBinaryString(num);
		System.out.println(Binary);
	}

	}
}
