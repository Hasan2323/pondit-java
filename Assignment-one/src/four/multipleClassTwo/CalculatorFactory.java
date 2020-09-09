package four.multipleClassTwo;

import four.multipleClass.InvalidArithmeticOperatorException;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 1:07 AM
 */

public class CalculatorFactory {
    protected static Operation getOperator(char operator) {
        Operation operation = new Operation();
        switch (operator) {
            case '+':
                operation.setOperation(new Adder());
                break;
            case '-':
                operation.setOperation(new Subtractor());
                break;
            case '*':
                operation.setOperation(new Multiplier());
                break;
            case '/':
                operation.setOperation(new Divider());
                break;
            default:
                System.out.println("Wrong operator!! Operator is not correct");
                //throw new ArithmeticException("Wrong operator!! Operator is not correct");
                throw new InvalidArithmeticOperatorException("Wrong operator!! Operator is not correct");
        }
        return operation;
    }
}
