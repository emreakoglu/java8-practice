package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("LinkedHashSet");
		lhs.add("Ornek");
		lhs.add("Kod");
		lhs.add("Blogu");
		lhs.add("Java");

		// Traversing elements
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
