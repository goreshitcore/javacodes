
public class CreditAccount extends BankAccount {

	private int debt;
	
	public int getDebt() {
		return this.debt;
	}
	public void borrow(int amount) {
		this.debt -= amount;
	}
	
	
//override means that u don't provide that functionality
	@Override	
	public void deposit(int amount) {
		this.debt += amount;
	}
	//too string method overrides functionality
	@Override	
	public void withdraw(int amount) {
		this.debt -= amount;
	}
	@Override
	public String toString() {
		String balanceStr = super.toString();
		return balanceStr+"\ndebt = $"+this.debt;
	}
	
	public String toString1() {
		return "balance = " +this.balance+"\ndebt = $" +this.debt;
	}
}
