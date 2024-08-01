import java.util.Scanner;

public class ECounter {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter a phrase: ");
	        String message = scanner.nextLine();
	        int counter = 0;
	        for (int i = 0; i < message.length(); i++) {
	            char ch = message.charAt(i);
	            if (ch == 'e' || ch == 'E') {
	                counter++;
	            }
	        }

	        System.out.println("The phrase entered: " + message);
	        System.out.println("Number of 'e's found: " + counter);
		
		
	}
}
