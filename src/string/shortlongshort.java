package string;
import java.util.*;
public class shortlongshort {
	static String shortlong(String s1, String s2) {
		if(s1.length()<s2.length())
			return s1 +s2+s1;
		else
			return s2+s1+s2;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();

		System.out.println(shortlong(s1,s2));
}
}