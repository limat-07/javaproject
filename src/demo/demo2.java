package demo;

public class demo2 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, -1 };
		int sum = 6;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.printf("pair(%d,%d):",a[i],a[j]);
					count++;
				}
			}
		}
		System.out.println(count);


	}

}
