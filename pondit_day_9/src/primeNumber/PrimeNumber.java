package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        int flag = 1;

        if (num <= 1) {
            System.out.println("Number must be greater than 1.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // you can write (num/2) instead of Math.sqrt(num). But Math.sqrt is efficient.
                if (num % i == 0) {
                    System.out.println(num + " is not prime!");
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println(num + " is Prime!");
            }
        }

        // built-in way.
//        BigInteger bigInteger = new BigInteger(String.valueOf(num));
//        boolean probablePrime = bigInteger.isProbablePrime(1);
//        System.out.println(probablePrime);

    }
}
