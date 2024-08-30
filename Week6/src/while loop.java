public class Digits {
    public static void main(String[] args) {
        int number = 12345;
        int product = 1;

        do {
            product *= number % 10 ;
          //multiply last digit
                     number /= 10;
          //remove last digit
        } while (number > 0); 
//reads till 0
        System.out.println(product);
    }
}
