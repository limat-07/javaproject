package projects;

import java.util.LinkedList;

public class linkedlistexample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		list.set(2, "E");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
