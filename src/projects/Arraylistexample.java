package projects;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		list.set(2, 50);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}

}
