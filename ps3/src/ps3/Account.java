package ps3;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		this.dateCreated = new Date();
	}
	
	public Account(int id, double bal) {
		this.id = id;
		this.balance = bal;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double bal, double ar) {
		this.id = id;
		this.balance = bal;
		this.annualInterestRate = ar;
		this.dateCreated = new Date();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double bal) {
		this.balance = bal;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double r) {
		this.annualInterestRate = r;
	}
	
	public Date getDate() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 12);
	}
	
	public void withdraw(double amt) throws InsufficientFundsException {
		 if (amt <= balance)
			 balance -= amt;
		 else {
			 double needs = amt - balance;
			 throw new InsufficientFundsException(needs);
		 }
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
}
