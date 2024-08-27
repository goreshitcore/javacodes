import java.util.Scanner;  // Import the Scanner class

public class Afterpay {

	public static void main(String[] args) {
		
	    Scanner enternum = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter cost");
        int num= enternum.nextInt();
        
		if ( num >= 200 && num <= 300 ) {
			System.out.println("1 Purchase");
		}
		if (num >= 50 && num <= 100) {
			System.out.println("2 Purchases");
		}
		if ( num >= 0 && num <= 49 ) {
			System.out.println("3 Purchases");
		}
		else {
			System.out.println("GIRL SAVE UPPPP!!!");
		}
		
	    
	}

}
