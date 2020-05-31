package palindrome;

import java.util.Arrays;
import java.util.Scanner;

// madam
public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.print("Please Enter a String: ");
        String str = sc.nextLine();

        char[] charArr = str.toLowerCase().toCharArray();

        for (int i = 0; i <= charArr.length/2; i++){
            if (charArr[i] != charArr[charArr.length - (i+1)]) {
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(str + " is a Palindrome!");
        } else {
            System.out.println(str + " is not a Palindrome!");
        }


    }

}
