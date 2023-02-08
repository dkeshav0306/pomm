package collection;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("keshav");
		stack.push("madhav");
		stack.push("roshan");
		stack.push("rohit");
		stack.push("keshav");
		stack.pop();
		Iterator<String> loop = stack.iterator();
		while (loop.hasNext()) {
			System.out.println(loop.next());
		}

	}
}
