package primeNumber;

import java.util.Arrays;

public class PrimeInterval {
    public static void main(String[] args) {
        int count = 0, it = 0;
        int[] numArr = new int[99];
        int[] primeArr = new int[30];

        for (int i = 2; i <= 100; i++){
            numArr[it] = i;
            it++;
        }

        System.out.println(Arrays.toString(numArr));

        for (int num : numArr) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                primeArr[count] = num;
            }

        } // foreach

        System.out.println("Total (1-100) : " + count);
        for (int i = 1; i <= count; i++){
            System.out.print(primeArr[i] + " ");
        }

    }// main
}
