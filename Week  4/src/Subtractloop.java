import java.util.Scanner;

public class SubtractLoop {
    public static void main(String[] args) {
        double startNumber = 50.0;
        double input = 0;
        int counter = 0;
        double temp = startNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to subtract by: ");
        input = scanner.nextDouble();

        while (temp > 0) {
            temp -= input;
            counter++;
            System.out.printf("%.1f - %.1f = %.1f%n", startNumber, input, temp);
        }

        System.out.printf("%.1f was subtracted %d times from %.1f%n", input, counter, startNumber);
    }
}
