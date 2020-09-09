package four.multipleClass;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/9/20 11:44 PM
 */

public class CalculatorFactory {

    protected static Calculator getOperation(char operator) {
        switch (operator) {
            case '+':
                return new Addition();
            case '-':
                return new Subtraction();
            case '*':
                return new Multiplication();
            case '/':
                return new Division();
            default:
                System.out.println("Wrong operator!! Operator is not correct");
                //throw new ArithmeticException("Wrong operator!! Operator is not correct");
                throw new InvalidArithmeticOperatorException("Wrong operator!! Operator is not correct");
        }
    }

}
