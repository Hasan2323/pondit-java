package fibonacci;
import java.util.Scanner;

public class FibonacciTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        int previous, current = 0, next = 1;

        if (length <= 0) {
            System.out.println("please enter greater than 0");
        }

        for (int i = 0; i < length; i++) {
            if (i != length)
                System.out.print(current + " ");
            previous = current;
            current  = next;
            next    += previous;

        }
    }
}

