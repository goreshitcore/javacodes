
public class Audit extends BankAccount {
	
	private int depositCount;
	private int withdrawCount;
	
	public Audit() {
		super(); //calls parent class
		depositCount = 0;
		withdrawCount = 0;
	}
	
	@Override
	public void deposit(int amount) {
        super.deposit(amount);
        depositCount++;
    }
	
	@Override
	public void withdraw(int amount) {
		super.deposit(amount);
		withdrawCount++;
	}
	
	@Override
	public String toString() {
        return "Deposit Count: " + depositCount + ", Withdrawal Count: " + withdrawCount;
    }
	
	public static void main(String[] args) {
		
	
	}
}
