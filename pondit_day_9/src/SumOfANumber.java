import java.util.Scanner;

public class SumOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, lastDigit;
        int temp = num;

        while(num > 0) {
            lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }

        System.out.println("Sum of " + temp + " is: " + sum);

    }
}
