package thread_runnable;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSample threadSample = new ThreadSample();
		
		threadSample.start();
		
		System.out.println("***********************");
		
		Thread runnable = new Thread(new RunnableSample("Run"));
		
		runnable.start();
		
		
		Thread t1 = new Thread(new Sync_Runnable());
		Thread t2 = new Thread(new Sync_Runnable());
		t1.start();
		t2.start();
		
	}

}
