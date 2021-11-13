package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();

		hs.add("HashSet");
		hs.add("Ornek");
		hs.add("Kod");
		hs.add("Blogu");
		hs.add("Java");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
