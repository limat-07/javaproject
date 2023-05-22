package list;

import java.util.*;

class CustomizeArray<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("only int float double can print");
		} 
	}
}

public class exercise2 {

	public static void main(String[] args) {
		ArrayList<Object> list = new CustomizeArray<>();

		try {
			list.add(12);
			list.add(123.66f);
			list.add(6.88898d);
//			list.add("Tam");
			System.out.println(list);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
}