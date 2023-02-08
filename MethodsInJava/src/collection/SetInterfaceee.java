package collection;

import java.util.HashSet;

public class SetInterfaceee {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("mango");
		set.add("orange");
		set.add("kiwi");
		set.add("banana");
		set.add("mango");
		
		for(String a :set) {
			System.out.println(a);
		}
		
	
	}
}
