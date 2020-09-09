package four.multipleClassTwo;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 12:49 AM
 */

public class Adder implements Calculator {
    @Override
    public double process(double num1, double num2) {
        return num1 + num2;
    }
}
