package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Mapdemo {

	public HashMap hashMap;
	// veriyi sıralamak için TreeMap yapısı
	private TreeMap treeMap;

	public void startDemo() {
		hashMap = new HashMap();
		hashMap.put("Key1", new Double(3434.34));
		hashMap.put("Key2", new Integer(123));
		hashMap.put("Key3", new String(" Ankara"));
		hashMap.put("Key4", new Boolean(true));
		hashMap.put("Anahtar1", new String("Testing"));
		// Sort the hash map using a tree map
		treeMap = new TreeMap(hashMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mapdemo md = new Mapdemo();
		md.startDemo();
		System.out.print(" HashMap : ");
		System.out.println(md.hashMap);
		System.out.print(" TreeMap : ");
		System.out.println(md.treeMap);
	}

}
