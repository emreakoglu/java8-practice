package memory_gc;

public class GCNesnesi {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("GC çalışacak");
		super.finalize();
	}
	
	

}
