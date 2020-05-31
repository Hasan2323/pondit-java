import java.util.Scanner;

public class ponditDayNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        // if (day == "Friday" || day == "Saturday") it will always false and that's y it will go to else.
        if (day.equals("Friday") || day.equals("Saturday")){
            System.out.println("Weekend");
        } else {
            System.out.println("Work day");
        }

        switch (day){
            case "Friday":
            case "Saturday":
                System.out.println("It's Weekend");
                break;
            default:
                System.out.println("It's work day.");
        }
        // infinite loop
//        for (;;){
//            System.out.println("Infinite");
//        }

        if (true){
            System.out.println("Always true. So no need to write 'if' like this");
        }
    }
}
