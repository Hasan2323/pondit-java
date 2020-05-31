package palindrome;

import java.util.Scanner;

public class PalindromeMathematical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.print("Enter a Number: ");
        int num = sc.nextInt(), remainder, sum = 0, temp;
        int forShowing = num;

        temp=num;

        while(num>0){
            remainder=num%10;  //getting remainder
            sum=(sum*10)+remainder;
            num=num/10;
        }

        String result = (temp==sum) ? " is palindrome number" : " is Not Palindrome number";

        System.out.println(forShowing + result);
    }
}
