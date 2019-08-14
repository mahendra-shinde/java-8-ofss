package demo6;

public class NewThread {

	public static void main(String[] args) {
		Repeater rp1 = new Repeater("Hello World");
		Repeater rp2 = new Repeater("Hello India");
		
		rp1.start(); //Register "rp1" as Thread in JVM's Task Scheduler
		rp2.start();
		
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

class Repeater extends Thread{
	
	private String text;
	private boolean stop=false;

	public Repeater(String text) {
		super();
		this.text = text;
	}
	
	public void stopThread() {
		stop = true;
	}
	
	public void run() {
		int counter = 1;
		while(!stop) {
			System.out.println(counter+" "+ text);
			
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