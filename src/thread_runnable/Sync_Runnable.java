package thread_runnable;

public class Sync_Runnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (Sync_Runnable.class) {
			
			for (int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName());
			}
			
		}
	}
	
	

}
