package two;

import java.util.Scanner;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 1:54 PM
 */

public class PaySalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic salary of the lowest grade : ");
        long basicSalaryOf6thGrade = sc.nextLong();

//        System.out.print("Balance of the company bank account : ");
//        long companyAccBalance = sc.nextLong();

        long basicSalary = 0;
        long[] mainSalaries = new long[7];

        for (int i = 6; i > 0; i--) {
            basicSalary += basicSalaryOf6thGrade;
            mainSalaries[i] = basicSalary + (basicSalary * 35/100);
        }

        for (int i = 6; i > 0; i--) {
            System.out.println(i + "th : " + mainSalaries[i]);
        }

        Employee emOne   = new Employee("Yamin", Grade.SIX.name(), "Cox", "01822", mainSalaries[6], 666661);
        Employee emTwo   = new Employee("Sunny", Grade.SIX.name(), "Dhaka", "01822", mainSalaries[6], 666662);
        Employee emThree = new Employee("Mishu", Grade.FIVE.name(), "Ctg", "01822", mainSalaries[5], 555551);
        Employee emFour  = new Employee("Saimon", Grade.FIVE.name(), "Dhaka", "01822", mainSalaries[5], 555552);
        Employee emFive  = new Employee("Sifat", Grade.FOUR.name(), "Ctg", "01822", mainSalaries[4], 444441);
        Employee emSix   = new Employee("Sohel", Grade.FOUR.name(), "Ctg", "01822", mainSalaries[4], 444442);
        Employee emSeven = new Employee("Abeer", Grade.THREE.name(), "Dhaka", "01822", mainSalaries[3], 333331);
        Employee emEight = new Employee("Akib", Grade.THREE.name(), "Dhaka", "01822", mainSalaries[3], 333332);
        Employee emNine  = new Employee("Miraz", Grade.TWO.name(), "Dhaka", "01822", mainSalaries[2], 222222);
        Employee emTen   = new Employee("Misbah", Grade.ONE.name(), "Dhaka", "01822", mainSalaries[1], 111111);


    }

}
