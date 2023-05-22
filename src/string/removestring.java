package string;
import java.util.*;
public class removestring {

	static String removex(String s) {
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
			return s.substring(1,s.length()-1);
		else
			return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(removex(s));
	}

}
