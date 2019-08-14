package demo6;

public class TransactionMain {

	public static void main(String[] args) {
		Account ac = new Account("Rajiv bhatia",23000);
		DepositTask task1 = new DepositTask(ac, 10000D);
		DepositTask task2 = new DepositTask(ac, 23000D);
		
		new Thread(task1).start();
		new Thread(task2).start();
		
	}

}
