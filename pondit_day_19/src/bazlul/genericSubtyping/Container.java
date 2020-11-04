package bazlul.genericSubtyping;

/**
 * @Author Muhammad Saimon
 * @since Nov 04, 2020 10:20 AM
 */

public class Container<T> {
    private static final int MAX_LENGTH = 10;
    private int currentIndex = 0;
    private T[] items;

    public Container() {
        items = (T[]) new Object[MAX_LENGTH];
    }

    public void addItem(T item) {
        if (currentIndex < MAX_LENGTH) {
            items[currentIndex++] = item;
        } else {
            System.out.println("Container is full.");
        }
    }

    public T getItem(int index) {
        if (index >= MAX_LENGTH) {
            throw new IllegalArgumentException("Index cannot be larger than MAX_LENGTH " + MAX_LENGTH);
        }
        return items[index];
    }

    public void printAllByForeach() {
        for (T item : items) {
            System.out.print(item + ", ");
        }
    }

    public void printAllByFor() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(items[i] + ", ");
        }
    }

}
