package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("LinkedHashSet");
		ts.add("Ornek");
		ts.add("Kod");
		ts.add("Blogu");
		ts.add("Java");

		// Traversing elements
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
