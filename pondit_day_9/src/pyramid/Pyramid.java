package pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter length: ");
        int lengthOfPy = scanner.nextInt();

        for (int row = 1; row <= lengthOfPy; row++) {

            for (int col = row; col < lengthOfPy; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row*2 - 1; col++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
