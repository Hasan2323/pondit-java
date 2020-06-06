package packageOne;

public class PrivateConstructor {

    String name;
    int age;

    private PrivateConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        PrivateConstructor pc = new PrivateConstructor("Hasan", 25); // possible inside the class.
        System.out.println(pc.age);

    }

}

// Produce error
// you can access it using this() method. To get details, see ThisInConstructor class.
class TestClassForAccessingConstructor {
    public static void main(String[] args) {
        PrivateConstructor pc = new PrivateConstructor("Hasan", 25); // Not possible outside of class
        System.out.println(pc.age);

    }
}
