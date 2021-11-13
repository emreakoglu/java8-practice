package thread_runnable;

public class RunnableSample implements Runnable {
	
	private String caller;
	
	public RunnableSample(String caller) {
		this.caller = caller;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		try {
//			Thread.sleep(5*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Caller: " + caller + " Amd Code executed by: " + Thread.currentThread().getName());
		

	}

}
