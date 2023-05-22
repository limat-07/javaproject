package Flowcontrolstatements;
import java.util.*;
public class printnumbers {
	public static void number(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=49 && s.charAt(i)<=57) {
				System.out.println(s.charAt(i));
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		number(s);
	}

}
