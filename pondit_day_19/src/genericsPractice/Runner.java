package genericsPractice;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/25/20 2:23 PM
 */

public class Runner {
    public static void main(String[] args) {
        CustomList<String> customListS = new CustomList<>();
        CustomList<Integer> customListI = new CustomList<>();
        CustomList<Character> customListC = new CustomList<>();

        customListS.addData("Muhammad");
        customListI.addData(44);
        customListS.addData("Abid");
        customListI.addData(99);
        customListC.addData('C');

        System.out.println(customListC.getData());

        System.out.println("##############");

        System.out.println(CustomList.genericMethodSingleParameter("hasan"));
        System.out.println(CustomList.genericMethodDoubleParameter("Abid", 12));
        System.out.println(CustomList.genericMethod(100, 12.50));


    }
}
