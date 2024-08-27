
public class BankAccount {
	String name;
	int balance;

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.name = "Robin Banks";
		ba.balance = 10;
		System.out.printf("name = %s\n", ba.name);
		System.out.printf("balance = %d\n", ba.balance);
		
		BankAccount ba1 = new BankAccount();
		ba1.name = "X";
		System.out.printf(ba1.name);

	}

}
