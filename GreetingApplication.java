import java.util.Scanner;

public class GreetingApplication {
	public static void main (String[] args)
	{
		System.out.println("Whats your name?");
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		System.out.println("Hello "+message);
	}
	
	
}