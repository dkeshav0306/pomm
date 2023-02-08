package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueee {

	public static void main(String[] args) {
		PriorityQueue<String> q = new  PriorityQueue<String>();
		q.add("Mango");
		q.add("orange");
		q.add("kiwi");
		q.add("apple");
		q.add("mango");
		
		System.out.println("Head : " + q.element());
		System.out.println("Head : "+ q.peek());
		
		q.remove();
			
		System.out.println("Head : "+ q.element());
		System.out.println();
		for(String a:q) {
			System.out.println(a);
		}	
		
		q.poll();
		System.out.println();
		Iterator<String> s1 =  q.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
		
	}
}
