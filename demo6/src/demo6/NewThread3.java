package demo6;

import java.util.concurrent.*;

public class NewThread3 {

	public static void main(String[] args) {
		MyRepeater2 rp1 = new MyRepeater2("Hello World");
		MyRepeater2 rp2 = new MyRepeater2("Hello India");

		//Executor Service to create TWO threads
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(rp1);
		service.execute(rp2);
		
		try {
			Thread.sleep(10000);
			rp1.stopThread();
			rp2.stopThread();
			service.shutdown(); // Close all threads
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//Creating a TASK for Thread
class MyRepeater2 implements Runnable {

	private String text;
	private boolean stop = false;

	public MyRepeater2(String text) {
		super();
		this.text = text;
	}

	public void stopThread() {
		stop = true;
	}

	public void run() {
		int counter = 1;
		while (!stop) {
			System.out.println(" --- " + Thread.currentThread().getName()+" --- ");
			System.out.println(counter + " " + text);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			counter++;
		}
	}

}