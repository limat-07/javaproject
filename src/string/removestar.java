package string;
import java.util.*;
public class removestar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String[] star=s.split(".[\\*]+.");
		StringBuffer sb =new StringBuffer();
		for(String x:star)
			sb.append(x);
		System.out.println(sb);
	}

}
