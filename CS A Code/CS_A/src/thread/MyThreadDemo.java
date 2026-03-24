package thread;

public class MyThreadDemo {
	public static void main(String[] args) {
			MyThread m1 = new MyThread();
			//Schedules this thread to begin execution. 
			//The thread will execute independently of the current thread.
//A thread can be started at most once. 
			//In particular, a thread can not be restarted after it has terminated
			m1.start();
			MyThreadRunnable mr = new MyThreadRunnable();
			Thread t1 = new Thread(mr);
			t1.start();
			for (int i=-100;i<0;i++) {
				System.out.println("Main "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
	
	}
}
