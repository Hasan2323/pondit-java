package bazlul;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/27/20 11:49 AM
 */

public class Tuple<M, H> {
    private M m;
    private H h;

    public Tuple(M m, H h) {
        this.m = m;
        this.h = h;
    }

    public M getM() {
        return m;
    }

    public H getH() {
        return h;
    }

    public void showTypes() {
        System.out.println("Type of M is: " + m.getClass().getName() + " and Value is: " + m);
        System.out.println("Type of H is: " + h.getClass().getName() + " and Value is: " + h);
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Hello", "world");
        tuple.showTypes();

        System.out.println();

        Tuple<String, Integer> person = new Tuple<>("Hasan", 26);
        person.showTypes();

        System.out.println();

        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple = new Tuple<>("Muhammad Hasan", new Tuple<>(26, 25));
        tupleInsideTuple.showTypes();

    }

}
