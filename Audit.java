
public class Audit extends BankAccount {
	private int depositCount;
	private int withdrawCount;
	
	
	@Override
	public void deposit(int amount) {
		super.deposit(amount);
		this.depositCount++;
	}
	
	@Override
	public void withdraw(int amount) {
		super.withdraw(amount);
		this.withdrawCount++;
		
	}
	
	public String toString() {
		return this.balance+"\ndepositCount = $"+this.depositCount
				+"\nwithdrawCount ="+this.withdrawCount;
		
	}
	
	public Audit() {
		this.depositCount = 0;
		this.withdrawCount = 0;
	}
	
	
	

}
