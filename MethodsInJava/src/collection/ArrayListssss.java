package collection;

import java.util.ArrayList;

public class ArrayListssss {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("orange");
		list.add("kiwi");
		list.add("mango");
		// Iterator<String> loops = list.iterator();
		// while(loops.hasNext()) {
		for (String lt : list) {
			System.out.println(lt);
		}
	}
}
