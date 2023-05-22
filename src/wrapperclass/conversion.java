package wrapperclass;
import java.util.*;
public class conversion {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int num =sc.nextInt();


System.out.println("Java Test"+num);
System.out.println("Given number :"+num);
System.out.println("Binary equivalent :"+Integer.toBinaryString(num));
System.out.println("Octal Equivalent :"+Integer.toOctalString(num));
System.out.println("Hexadecimal Equivalent:"+ Integer.toHexString(num));
	}

}
