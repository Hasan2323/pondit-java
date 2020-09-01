package customException;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/1/20 11:59 PM
 */

public class Data {
    public static void main(String[] args) {
        String name = " ";
        try {
            name = getName(name);
            System.out.println("The Name is : " + name);
        } catch (DataNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        System.out.println("Out of Error");
    }

    private static String getName(String name) throws DataNotFoundException {

        if (name.isBlank()) {
            throw new DataNotFoundException("String is Empty");
        }

        return name;

    }
}
