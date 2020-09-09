package four.multipleClass;

import java.util.Scanner;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/9/20 10:22 PM
 */

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        System.out.print("Enter Second number: ");
        double num2 = scan.nextDouble();

        if (operator == '/' && num2 < 1) {
            System.out.println("For division, divisor must be greater than 0");
            return;
        }

        Calculator calculator = CalculatorFactory.getOperation(operator);
        double result = calculator.calculate(num1, num2);
        System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);

    }

}
