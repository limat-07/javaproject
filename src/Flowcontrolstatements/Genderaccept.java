package Flowcontrolstatements;

public class Genderaccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String gender=args[0];
int age=Integer.parseInt(args[1]);
if(gender.equalsIgnoreCase("female")) {
	if(age>=1 && age<=58)
		System.out.println("Interest=8.2%");
	else if(age>58 && age<=100)
		System.out.println("Interest = 9.2%");
	else
		System.out.println("no result");
}
else {
	if(age>=1 && age<=58)
		System.out.println("Interest=8.4%");
	else if(age>58 && age <=100)
		System.out.println("interest=10.5%");
	else
		System.out.println("no result");
}
	}

}
