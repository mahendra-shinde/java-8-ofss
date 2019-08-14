package demo6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {

	public static void main(String[] args) {
		Factorial f1 = new Factorial(4);
		Factorial f2 = new Factorial(5);
		
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Long> result1= service.submit(f1);
		Future<Long> result2= service.submit(f2);
		
		try {
			Long ans1 = result1.get(10, TimeUnit.MILLISECONDS);
			Long ans2 = result2.get(10,TimeUnit.MILLISECONDS);
			System.out.println("4! "+ans1);
			System.out.println("5! "+ans2);
			
			service.shutdown();
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class Factorial implements Callable<Long>{

	private int num;
	
	public Factorial(int num) {
		super();
		this.num = num;
	}

	@Override
	public Long call() throws Exception {
		long f = 1;
		long n = 1;
		for(;n<=num;n++) {
			f = f * n;
		}
		return f;
	}
	
}
