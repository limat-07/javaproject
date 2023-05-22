package Array;
import java.util.Scanner;
public class maximumandminimum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num =sc.nextInt();
int a[]= new int[num];
for(int i=0;i<num;i++) {
	System.out.println("");
	a[i]=sc.nextInt();
}
int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++) {
if(a[i]>max) {
	max=a[i];
}
}
System.out.println(max);
for(int j=0;j>a.length;j++) {
	if(a[j]<min) {
		min=a[j];
	}
}
System.out.println(min);
}

}
