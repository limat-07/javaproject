package Array;
import java.util.Scanner;
public class Sumofarray {

	public static void main(String[] args) {
int sum=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a[]=new int[num];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	sum=sum+a[i];
}
System.out.println(sum);
float average =sum/a.length;
System.out.println(average);
	}

}
