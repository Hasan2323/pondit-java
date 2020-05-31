package pyramid;

import java.util.Scanner;

/*
     *
    **
   ***
  ****
 *****
******
*/
public class pyramid2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfpy = scanner.nextInt();

        for (int i = 1; i <= lengthOfpy; i++) {

            for (int j = i; j < lengthOfpy; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}