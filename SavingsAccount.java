package edu.smg;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double sumToWithdraw) {
		if(balance >= sumToWithdraw) {
			balance -= sumToWithdraw;
		} else {
			System.out.println("Error");
		}
	}
	public String toString() {
		return super.toString() + "\nSavings account";
	}
}
