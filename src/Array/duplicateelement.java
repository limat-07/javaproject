package Array;

import java.util.Arrays;

public class duplicateelement {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,10};
		
		Arrays.sort(array);
		int[ ] temp=new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];	
			}
		}
		temp[j++]=array[array.length-1];
		System.out.println("");
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]+"");
		}
		
	}

}
