package four.multipleClassTwo;

import java.util.Scanner;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 12:00 AM
 */

public class Runner {

    public static void main(String[] args) {
        boolean go = true;

        while (go) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type number one: ");
            double num1 = scanner.nextDouble();

            System.out.print("Type operator(+,-,*,/): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Type number two: ");
            double num2 = scanner.nextDouble();

            if (operator == '/' && num2 < 1) {
                System.err.println("Error: For division, divisor must be greater than 0");
                System.out.print("\n\nWanna calculate again? Type anything for Yes and 'n' for No: ");
                char choice = scanner.next().charAt(0);
                if (choice == 'n') {
                    go = false;
                    System.out.println("Bye then! Take care.");
                }
                continue;
            }

            Operation operation = CalculatorFactory.getOperator(operator);
            operation.calculate(num1, num2);

            double result = operation.getResult();
            System.out.printf("%.1f %c %.1f = %.1f %n", num1, operator, num2, result);

            System.out.print("Wanna calculate again? Type anything for Yes and 'n' for No: ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                go = false;
                System.out.println("Bye then! Take care.");
            }
        }

    }
}
