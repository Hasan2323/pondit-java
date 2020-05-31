// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
package fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How long do you want: ");
        int length = sc.nextInt();

        int previousOne = 0, previousTwo = 1, current;

        if (length <= 0) {
            System.out.println("you should enter greater than 0");
        } else if (length == 1) {
            System.out.println("0");
        } else {
            System.out.print("0 1 ");
        }

        for (int i = 3; i <= length; i++) {
            current = previousOne + previousTwo;
            System.out.print(current + " ");
            previousOne = previousTwo;
            previousTwo = current;
        }
    }
}
