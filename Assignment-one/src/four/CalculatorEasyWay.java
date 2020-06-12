package four;

import java.util.Scanner;

public class CalculatorEasyWay {

    public static void main(String[] args) {

        boolean go = true;

        while (go) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input First number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Input Second number: ");
            double num2 = sc.nextDouble();

            double result;

            switch(operator)
            {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 < 1) {
                        System.out.println("For division, divisor must be greater than 0");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Wrong operator!! Operator is not correct");
                    return;
            }

            System.out.printf("%.1f %c %.1f = %.1f %n", num1, operator, num2, result);

            System.out.print("\nCalculate again?? Type y for yes and n for no: ");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                go = false;
                System.out.println("Bye then! Take care.");
            }
        }
    }
}
