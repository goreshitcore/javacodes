import java.util.Scanner;

public class Tally {
    public static void main(String[] args) {
        int tally = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to quit): ");
            int number = scanner.nextInt();
            if (number == 0) break;
            tally += number;
            System.out.printf("tally = %d%n", tally);
        }

        scanner.close();
    }
}