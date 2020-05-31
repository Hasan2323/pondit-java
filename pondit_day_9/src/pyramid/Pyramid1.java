package pyramid;

import java.util.Scanner;

/*
    *
   ***
  *****
 *******
*********

  ** */
public class Pyramid1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a number: ");
        int fs = 0, lengthOfpy = scanner.nextInt();

        for (int i = 1; i <= lengthOfpy; i++) {

            for (int j = i; j < lengthOfpy; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                fs = 1;
            }

            for (int j = 1; j <= fs; j++) {
                System.out.print("*");
            }
            fs = fs + 2;
            System.out.println();

        }

    }
}
