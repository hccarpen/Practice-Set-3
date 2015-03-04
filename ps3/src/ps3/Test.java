package ps3;

public class Test {
	
	public static void main(String[] args) {

		Account test = new Account(1122, 20000., 0.045);
		
		try {
			test.withdraw(25000);
		} catch (InsufficientFundsException e) {
			System.out.printf("Insufficient funds. You need $%.2f%n.", e.getAmount());
			e.printStackTrace();
		}
		
		try {
			test.withdraw(2500);
		} catch (InsufficientFundsException e) {
			System.out.printf("Insufficient funds. You need $%.2f%n.", e.getAmount());
			e.printStackTrace();
		}
		
		test.deposit(3000);
		
		System.out.printf("Account balance: $%.2f%n" +
				"Account monthly interest: $%.2f%n" + 
				"Account created: %s", test.getBalance(), (test.getMonthlyInterestRate() * test.getBalance()), test.getDate());
	}
}
