package Array;

import java.util.Scanner;

public class searchelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			if (a[i] == n) {
				System.out.println(i);
				break;
			}
		}
	}
}
