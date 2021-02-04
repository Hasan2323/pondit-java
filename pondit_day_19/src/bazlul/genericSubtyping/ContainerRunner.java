package bazlul.genericSubtyping;

/**
 * @Author Muhammad Saimon
 * @since Nov 04/11/2020 10:31
 */

public class ContainerRunner {
    public static void main(String[] args) {
        Container<String> cars = new Container<>();
        cars.addItem("Mercedes");
        cars.addItem("BMW");
        cars.addItem("Toyota");
        cars.addItem("volkswagen");


        System.out.println(cars.getItem(3));
        System.out.println("Print All by Foreach loop");
        cars.printAllByForeach();
        System.out.println("\nPrint All by For loop");
        cars.printAllByFor();

        System.out.println("\n###################################");

        Container<Integer> salary = new Container<>();
        salary.addItem(50000);
        salary.addItem(45000);
        salary.addItem(40000);
        salary.addItem(30000);
        salary.addItem(26000);
        salary.addItem(22000);


        System.out.println(salary.getItem(2));
        System.out.println("Print All by Foreach loop");
        salary.printAllByForeach();
        System.out.println("\nPrint All by For loop");
        salary.printAllByFor();

        System.out.println("\n###################################");


//        Container<String> stringContainer = new Container<>();
//        Container<Object> objectContainer = stringContainer; // this line produces Error.
//        objectContainer.addItem(new Object());



    }
}
