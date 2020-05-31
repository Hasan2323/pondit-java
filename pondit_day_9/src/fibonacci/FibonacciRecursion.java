// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
package fibonacci;
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tell us position (nth): ");
        int length = input.nextInt();

        System.out.print("Full series: ");
        for (int i = 1; i <= length; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\nin " + length + " position, the number is: " + fibonacci(length));
    }

    private static int fibonacci(int length) {
        if (length <= 0) {
            return 0;
        } else if (length == 1 || length == 2) {
            return 1;
        }
        return fibonacci(length - 1) + fibonacci(length - 2);
    }
}
