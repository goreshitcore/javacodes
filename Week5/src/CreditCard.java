
import java.lang.reflect.*;

public class CreditCard {
	//private int owing instance
	//private string name instance
	private int owing;
	private String name;
	
	//construtor with string
	public CreditCard(String name) {
		this.owing = -1;
	
	}
	//get method for owing
	public int getOwing() {
		return owing;
	}
	//public void with if statement
	//decrement value of owing by amount
	public void spend(int amount) {
		if ( amount >= 0) {
			owing -= amount;

		}
	}
	//void payback method increments value of owing by amount
	//without exceeding the value 0
	public void payback(int amount) {
		if (amount > 0) {
			owing += amount;
			
		}
		//if amount is less then 0 owing is not modified
		if (owing > 0) {
			owing = 0;
			
		}
	}

	//using new to create CreditCard instance with inputrobin banks
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard("Robin Banks");
        creditCard.spend(50);
        //using spend(50) in creditcard instance
        System.out.println("owing = " + creditCard.getOwing());
        creditCard.payback(100);
        //payback 100 to creditcard instance
        //using getmethod to print owing
        System.out.println("owing = " + creditCard.getOwing());

}
}
