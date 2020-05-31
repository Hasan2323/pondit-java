package pyramid;

import java.util.Scanner;

/*
    *
   ***
  *****
 *******
*********

*/
public class Pyramid1AnotherWay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a number: ");
        int fs = 0, lengthOfpy = scanner.nextInt();

        for (int i = 1; i <= lengthOfpy; i++) {

            printSpace(lengthOfpy - i);

            if (i == 1) {
                fs = 1;
            }

            printStar(fs);

            fs = fs + 2;
            System.out.println();

        }

    } //main

    private static void printStar(int lengthOfStar) {
        for (int j = 1; j <= lengthOfStar; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int length) {
        for (int j = 1; j <= length; j++) {
            System.out.print(" ");
        }
    }

}
