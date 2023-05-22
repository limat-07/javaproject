package string;
import java.util.*;
public class occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> hm =new HashMap<>();
		
		char[] ch=str.toCharArray();
		for(char c:ch) {
			
			if(hm .containsKey(c)) {	
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);			
				}
		}
		for(Map.Entry s1 : hm.entrySet()) {
			System.out.println(s1.getKey()+" "+s1.getValue());
		}
	}

}
