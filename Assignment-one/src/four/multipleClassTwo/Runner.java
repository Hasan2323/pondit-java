package four.multipleClassTwo;

import java.util.Scanner;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 12:00 AM
 */

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number one: ");
        double num1 = scanner.nextDouble();

        System.out.print("Type operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Type number two: ");
        double num2 = scanner.nextDouble();

        if (operator == '/' && num2 < 1) {
            System.out.println("For division, divisor must be greater than 0");
            return;
        }

        Operation operation = CalculatorFactory.getOperator(operator);
        operation.calculate(num1, num2);

        double result = operation.getResult();
        System.out.printf("%.1f %c %.1f = %.1f %n", num1, operator, num2, result);

    }
}
