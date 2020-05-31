package palindrome;

import java.util.*;

public class PalindromeReverseString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = in.nextLine(), reverse = ""; // Objects of String class

        int length = original.length();

        for (int i = length - 1; i >= 0; i--){
            reverse += original.charAt(i);
        }

        String result = (original.equals(reverse)) ? " is a palindrome" : " is NOT a palindrome";
        System.out.println(original + result);
    }
}  