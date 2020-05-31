package palindrome;

import java.util.Scanner;

public class PalindromeUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.print("Enter a String/Number: ");
        String str = sc.nextLine().toLowerCase();

        int begin = 0;
        int end   = str.length()-1;

        while (begin<end) {
            if (str.charAt(begin) != str.charAt(end)) {
                flag = false;
                break;
            }
            begin++;
            end--;
        }

        String result = (flag) ? " is Palindrome" : " is Not Palindrome";

        System.out.println(str + result);

    }
}
