package four.multipleClassTwo;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/10/20 12:52 AM
 */

public class Divider implements Calculator {
    @Override
    public double process(double num1, double num2) {
        return num1 / num2;
    }
}
