package edu.smg;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount acc1 = new SavingsAccount(2309, 1000);
		CheckingAccount acc2 = new CheckingAccount(2310, 900, 5000);
		acc1.withdraw(200);
		System.out.println(acc1.getId() + ": \n" + acc1.toString());
		acc2.withdraw(2000);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
		acc1.withdraw(600);
		System.out.println(acc1.getId() + ": \n" + acc1.toString());
		acc2.withdraw(4000);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
		acc2.deposit(200);
		System.out.println(acc2.getId() + ": \n" + acc2.toString());
	}

}
