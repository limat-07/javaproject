package Array;

import java.util.*;

public class evenoddarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt(n);
		}
		
				int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(a));
	}

}
