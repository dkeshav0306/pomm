package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListss {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("mango");
		link.add("orang");
		link.add("kiwi");
		link.add("banana");
		link.add("kiwi");
		Iterator<String> loop = link.iterator();
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}

}
