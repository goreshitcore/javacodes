public class Fibonacci
{
    public static void main(String[] args) {
        int a = 0; // F(0)
        int b = 1; // F(1)
        System.out.println(a); // print F(0)
        System.out.println(b); // print F(1)

        for (int i = 2; i <= 9; i++) {
            int fib = a + b; // calculate F(i)
            System.out.println(fib); // print F(i)
            a = b; // update a to F(i-1)
            b = fib; // update b to F(i)
        }
    }
}