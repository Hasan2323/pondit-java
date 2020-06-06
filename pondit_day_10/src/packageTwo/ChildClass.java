package packageTwo;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();

        //Can access default modifier within this package
        String name = obj.name;
        obj.play();
        System.out.println(name);

    }
}
