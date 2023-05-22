package Abstraction;

import java.util.Arrays;

abstract class railcoach {
	public abstract String notice();

}

class Luggage extends railcoach {
	public String notice() {
		return "Luggage class";
	}

}

class Ladies extends railcoach {
	public String notice() {
		return "ladies class";

	}
}

class firstclass extends railcoach {
	public String notice() {

		return "first class";
	}

}

class General extends railcoach {
	public String notice() {
		return "General class";
	}

}

public class testcompartment {

	public static void main(String[] args) {
		String[] rail = new String[10];
		for (int i = 0; i < rail.length; i++) {
			int coach = (int) (Math.random() * 4) + 1;
			if (coach == 1) {
				Luggage lug = new Luggage();
				rail[i] = lug.notice();
			} else if (coach == 2) {
				Ladies lad = new Ladies();
				rail[i] = lad.notice();
			} else if (coach == 3) {
				General gen = new General();
				rail[i] = gen.notice();
			} else if (coach == 4) {
				firstclass first = new firstclass();
				rail[i] = first.notice();
			}
		}
		System.out.println(Arrays.toString(rail));

	}
}
