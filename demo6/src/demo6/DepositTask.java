package demo6;

public class DepositTask implements Runnable{

	private Account account;
	private Double amount;
	
	
	
	public DepositTask(Account account, Double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " Initaiting Deposit" );
		AccountTransaction tn = new AccountTransaction();
		tn.deposit(account, amount);
		System.out.println(Thread.currentThread().getName()+ " Transaction completed" );
	}

}
