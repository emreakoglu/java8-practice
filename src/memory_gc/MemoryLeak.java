package memory_gc;

import java.util.ArrayList;
import java.util.Random;

public class MemoryLeak {
	
	public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		GCNesnesi gcNesnesi = new GCNesnesi();
		
		gcNesnesi = null;
		
		System.gc();

	}

}
