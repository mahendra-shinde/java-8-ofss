package demo6;

public class AccountTransaction {
	private static final double MIN_BALANCE = 1000;

	public void deposit(Account ac, double amt) {
		synchronized (ac) {
			double balance = ac.getBalance();
			System.out.println("Deposit Transaction : Available Balance: " + balance);
			balance += amt;
			ac.setBalance(balance);
			System.out.println("Deposit Transaction : Deposit was successful, new balance: " + balance);
		}
	}

	public void withdraw(Account ac, double amt) {
		synchronized (ac) {
			double balance = ac.getBalance();
			System.out.println("Withdraw Transaction : Available Balance: " + balance);
			balance -= amt;
			if (balance > 1000) {
				ac.setBalance(balance);
				System.out.println("Withdraw Transaction : Withdrawal was successful, new balance: " + balance);
			} else {
				System.out.println("Withdraw Transaction : Insufficient funds");
			}
		}
	}

}
