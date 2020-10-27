package bazlul;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/27/20 11:25 AM
 */

public class GenericClassTest {

    public static void main(String[] args) {
        // Java supports two types. Primitive type and Reference type.
        // But Generic only works with Reference type or Object.
        // Generic<int> intObj = new Generic<int>(88); // Error cause Type argument can't be a primitive type.
        Generic<Integer> iObj = new Generic<>(88);
        iObj.showType();
        int v = iObj.getObj();
        System.out.println("Value: " + v);

        Generic<String> strOb = new Generic<>("This is a Generics Test");
        strOb.showType();
        String str = strOb.getObj();
        System.out.println("Value: " + str);
    }

}
