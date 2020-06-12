package four;

import java.util.Scanner;

public abstract class Calculator {
    protected abstract double addition(double num1, double num2);
    protected abstract double subtraction(double num1, double num2);
    protected abstract double multiplication(double num1, double num2);
    protected abstract double division(double num1, double num2);
}

class Execution extends Calculator {

    @Override
    protected double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    protected double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    protected double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    protected double division(double num1, double num2) {
        return num1 / num2;
    }

}

class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        boolean start = true;

        while (start) {
            System.out.print("Input First number: ");
            num1 = sc.nextDouble();

            System.out.print("Input Operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Input Second number: ");
            num2 = sc.nextDouble();

            Execution execution = new Execution();

            switch (operator) {
                case '+':
                    result = execution.addition(num1, num2);
                    break;

                case '-':
                    result = execution.subtraction(num1, num2);
                    break;

                case '*':
                    result = execution.multiplication(num1, num2);
                    break;

                case '/':
                    if (num2 < 1) {
                        System.out.println("For division, divisor must be greater than 0");
                        return;
                    }
                    result = execution.division(num1, num2);
                    break;

                default:
                    System.out.println("Wrong operator!! Operator is not correct");
                    return;
            }

            System.out.printf("The result is " + num1 + " %c " + num2 + " = %.2f %n", operator, result);

            System.out.print("\nCalculate again?? Type y for yes and n for no: ");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                start = false;
                System.out.println("Bye then! Take care.");
            }
        }

    }
}

