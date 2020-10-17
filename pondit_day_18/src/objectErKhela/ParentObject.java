package objectErKhela;

import typeCasting.Bird;
import typeCasting.Dog;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/17/20 9:50 PM
 */

//public class ParentObject extends Object {
//
//}

// Every class by default vabe 'Object class' k extends kore. so alada kore extends Object likhar dorkar nai.
// So in Java, Object class is a parent of all class. and every class is a child of Object Class.

public class ParentObject  {
    public static void main(String[] args) {

        prLn("My name is Hasan!");
        prLn(893342343);
        prLn(new Dog());

        // ai j ekhane prLn() dekha jacche parameter Object type. So ekhane jekono kichu pathanu jabe.
        // jekono class pathanu jabe cause sob class e tar child. like
        Object objDog = new Dog();
        Object objBird = new Bird();
        Object str = "Hello there";
        Object num = 23;

    }

    private static void prLn(Object anything) {
        System.out.println(anything);
    }

}
