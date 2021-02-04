// TODO: Every class by default extends Object class. you don't need to write "extends Object".
// TODO: So Object class is a "default parent" of any class.

public class CopyObject /* extends Object */ {
    private String name;
    private int age;

    public CopyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CopyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MainClass {
    public static void main(String[] args) {
        CopyObject obj = new CopyObject("Abid", 25);

        CopyObject cpyObj = obj;

        String result = cpyObj.toString();

        System.out.println(result);
    }

}
