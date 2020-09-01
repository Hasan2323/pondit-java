package one;

import java.util.Scanner;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 9:28 AM
 */

public class FindDayNameOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find the Day name according to date"
        // Month : December and started with sunday"

        boolean start = true;

        while (start) {
            System.out.print("Enter date(1 to 31): ");
            int date = sc.nextInt();

            if (date < 1 || date > 31) {
                System.err.println("Invalid date! Try again.");
                System.out.println();
                continue;
            }

            int reminder = date % 7;

            String day = "";

            switch (reminder) {
                case 0:
                    day = "Saturday";
                    break;
                case 1:
                    day = "Sunday";
                    break;
                case 2:
                    day = "Monday";
                    break;
                case 3:
                    day = "Tuesday";
                    break;
                case 4:
                    day = "Wednesday";
                    break;
                case 5:
                    day = "Thursday";
                    break;
                case 6:
                    day = "Friday";
                    break;
            }

            System.out.println("Day = " + day);

            System.out.print("\nTry again? press any key for Yes and n for No: ");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                start = false;
                System.out.println("Bye then! Thanks.");
            }
        }
    }
}
