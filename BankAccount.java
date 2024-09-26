
public class BankAccount {
	//private only this class can access
	//public anyone can access
	//protected, subclasses can access
	//if it doesn't tell u to extend to a superclass it will extend to object class
	//static means there is only one balance for all BankAccounts

	static protected int balance;

	
	@Override	
	public String toString() {
		return "balance = $" +this.balance;
	}
	
	//get method
	public int getBalance() {
		return this.balance;
	}
	//deposit
	public void deposit(int amount) {
		this.balance += amount;
	}
	//withdraw
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	//store balance
	public BankAccount() {
		this.balance = 100;
	}
}
