package classandobject;

public class calculator {
	static double power1;
	static double power2;
	
	static double powerInt(int num1,int num2) {
		power1=Math.pow(num1,num2);
		return power1;
	}
	static double powerDouble(double num1,int num2) {
		power2=Math.pow(num1,num2);
		return power2;
	}
public static void main(String[] args) {
	double p1=calculator.powerInt(2,5);
	double p2=calculator.powerDouble(23,2);
	System.out.println(p1);
	System.out.println(p2);
}
}