package thread;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Runnable "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
//The type MyThreadRunnable must implement the 
	//inherited abstract method Runnable.run()
}
