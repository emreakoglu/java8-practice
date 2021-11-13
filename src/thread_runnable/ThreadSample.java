package thread_runnable;

public class ThreadSample extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Uzun İslem Sonucu");
	}

}
