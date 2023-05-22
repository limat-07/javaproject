package projects;

import java.lang.*;

public class twodimensionalarray {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		arr[0][0] = 10;
		arr[0][3] = 10;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][i] + " ");
			}
			System.out.println();

		}
		

	}

}
