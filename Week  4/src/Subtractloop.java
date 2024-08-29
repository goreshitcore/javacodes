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

        System.out.println(startNumber + " - " + input + " = " + (temp - input ));
        while (temp > 0) {
            temp -= input;
            counter++;

        }
        if(temp <= 0) {
            System.out.println(input + " was subtracted " + counter + " times from " + startNumber);
        }else{
            System.out.println(temp + " - " + input + " = " (temp-input));
        }
    }
}
