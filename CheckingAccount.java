package edu.smg;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		setOverdraftLimit(overdraftLimit);
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double sumToWithdraw) {
		if(balance + overdraftLimit >= sumToWithdraw) {
			balance -= sumToWithdraw;
		} else {
			System.out.println("Error");
		}
	}
	public String toString() {
		return super.toString() + "\nChecking account";
	}
}
