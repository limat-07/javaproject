package string;
import java.util.*;

public class nullstring {

	static String FirsthalfString(String S) {
		if(S.length()%2==0)
			return S.substring(0,S.length()/2);
		else
			return "null";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		
		System.out.println(FirsthalfString(S));
	
}
}