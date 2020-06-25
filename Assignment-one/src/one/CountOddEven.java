package one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int start = sc.nextInt(), evenCount = 0;
        System.out.print("Enter Ending number: ");
        int end = sc.nextInt(), oddCount = 0;
        List<Integer> evenNumbers = new ArrayList<>();

        if (start < 0 || end < 0) {
            System.out.println("Number must not be negative!");
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Total even number count: " + evenCount);
            System.out.println("Total odd number count: " + oddCount);
            System.out.print("The even numbers between " + start + " and " + end + " are: ");

            evenNumbers.forEach(evenNumber -> {
                String comma = (evenNumber == end || evenNumber + 1 == end) ? "" : ", ";
                System.out.print(evenNumber + comma);
            });
//            for (Integer evenNumber : evenNumbers) {
//                System.out.print(evenNumber + ", ");
//            }
            System.out.println();
        }

    }
}
