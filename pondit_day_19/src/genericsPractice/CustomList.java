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
}
