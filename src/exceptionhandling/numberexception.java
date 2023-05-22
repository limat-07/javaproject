package exceptionhandling;
import java.util.*;
public class numberexception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of element");
		int n =sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		try {
			System.out.println("Enter the index of number");
			int index = sc.nextInt();	
			int ele=a[index];
			System.out.println("the element ="+ ele);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			
		}
		catch(NumberFormatException e){
			System.out.println("java.lang.NumberFormatException");
			
		}
	}

}
