import java.util.Scanner;

public class MaxInteger {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.print("Please Enter a Number: ");
            value = scanner.nextInt();

            if (value > max) {
                max = value;
            }

            System.out.printf("max = %d%n", max);
        } while (value >= 0);

        scanner.close();
    }
}