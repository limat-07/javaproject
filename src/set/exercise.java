package set;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class exercise {
public static void main(String[] args) {
	
	TreeSet<String> set =new TreeSet<>();
	set.add("tamil");
	set.add("vijay");
	set.add("ram");
	set.add("pradish");
	
	System.out.println(set);
	NavigableSet<String> set2 = set.descendingSet();
	System.out.println(set2);
	Iterator<String> set3 =set.iterator();
	while(set3.hasNext()) {
		System.out.println(set3.next());
	}
	System.out.println("Enter name  to search");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		if(set.contains(s1)) {
			System.out.println("exist");
		}
		else {
			System.out.println("not exist");
		}
		
	}
}

