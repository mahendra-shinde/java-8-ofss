package demo6;

public class NewThread2 {

	public static void main(String[] args) {
		MyRepeater rp1 = new MyRepeater("Hello World");
		MyRepeater rp2 = new MyRepeater("Hello India");

		new Thread(rp1).start(); // Assign TASK to a THREAD and Launch Thread
		new Thread(rp2).start();

		try {
			Thread.sleep(10000);
			rp1.stopThread();
			rp2.stopThread();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//Creating a TASK for Thread
class MyRepeater implements Runnable {

	private String text;
	private boolean stop = false;

	public MyRepeater(String text) {
		super();
		this.text = text;
	}

	public void stopThread() {
		stop = true;
	}

	public void run() {
		int counter = 1;
		while (!stop) {
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