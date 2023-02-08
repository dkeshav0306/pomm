package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectorlists {
	public static void main(String[] args) {
		Vector <String> vc = new Vector<String>();
		vc.add("mango");
		vc.add("orang");
		vc.add("kiwi");
		vc.add("mango");
		Iterator<String>loop = vc.iterator();
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}

}
