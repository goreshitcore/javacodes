import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//Declare an int variable to represent the total factorial value
	    //Use a for loop to multiply every number between 1 and 10 together
	    //Use another for loop to print the equation. (hint: to make sure there
		int i, fact = 1;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		num = sc.nextInt();
		
		for (i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		 System.out.println("10! = ");
	        for (i = 1; i <= 10; i++) {
	            System.out.print(i);
	            if (i < 10) {
	                System.out.print(" * ");
	            }
	           		
	}
}
}