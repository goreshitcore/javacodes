import java.util.Scanner;

public class WhileGo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        boolean go = true;
        while (go) {
        	System.out.print("Go ?");
        	go = scanner.nextBoolean();
        	
        	if (!go) {
        		break;
        	}
        }
		
		

	}

}
