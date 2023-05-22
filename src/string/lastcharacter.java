package string;

import java.util.*;

public class lastcharacter {

	static String lastrepeat(String s, int n) {
		String repStr = s.substring(s.length() - n);
		String outStr = "";

		for (int i = 0; i < n; i++) {
			outStr += repStr;
		}
		return outStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(lastrepeat(s, n));
	}

}
