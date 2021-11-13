package thread_runnable;

public class Start_vs_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread startThread = new Thread(new RunnableSample("Start"));

		Thread runThread = new Thread(new RunnableSample("Run"));

		startThread.start();

		runThread.run();

	}

}
