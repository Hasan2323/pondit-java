package bazlul;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/27/20 11:22 AM
 */

public class Generic<T> {
    private T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }
}
