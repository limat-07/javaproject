package Flowcontrolstatements;

public class commandlineargumentornot {

	public static void main(String[] args) {
		if(args.length ==0) {
			System.out.println("no values");
		}
		else {
			for(String i:args)
			System.out.println(i+",");
		}
	}

}
