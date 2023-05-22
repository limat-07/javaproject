package projects;

import java.util.HashMap;

public class hashexample {


	public static void main(String[] args) {

		HashMap<String,Integer> hm =new HashMap<>();
		hm.put("A", 10);
		hm.put("B", 20);
		hm.put("c", 30);
		System.out.println(hm);
		
		hm.replace("A",40);
		System.out.println(hm);
		
		hm.remove("A");
		System.out.println(hm);
	
	}

}
