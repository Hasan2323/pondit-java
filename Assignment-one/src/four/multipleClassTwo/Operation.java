package four.multipleClassTwo;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 12:02 AM
 */

public class Operation {

    private Calculator calculator;
    private double result;

    public void setOperation(Calculator calculator) {
        this.calculator = calculator;
    }

    public void calculate(double num1, double num2) {
        this.result = calculator.process(num1, num2);
    }

    public double getResult() {
        return result;
    }
}
