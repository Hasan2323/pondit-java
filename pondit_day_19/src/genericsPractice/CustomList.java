package genericsPractice;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/25/20 11:13 AM
 */

public class CustomList<T> {
    private T data;
    //private static int index = 0;

    public void addData(T data) {
        this.data = data;
        //index++;
    }

    public T getData() {
        return data;
    }

    // Generic methods
    public static <E> E genericMethodSingleParameter(E e) {
        return e;
    }

    public static <E, V> E genericMethodDoubleParameter(E e, V v) {
        if (v instanceof Integer) {
            System.out.println((Integer) v + 10);
        } else if (v instanceof String) {
            System.out.println("Hello, " + v.toString());
        }
        return e;
    }

    // Generic method Bounded type
    // ekhane shudu oi value gula e arguments hisebe pass hobe jader parent Number. like int, float, double.
    // kono String or onno type pathale hobe na
    public static <E extends Number, V extends Number> int genericMethod(E e, V v) {
        return e.intValue() + v.intValue();
    }

}
