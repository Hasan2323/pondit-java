package StringBuilderAndBuffer;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/15/20 11:01 PM
 */

public class StringBuilderClassForPrac {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        str.append("I am ");
        str.append("Saimon");
        System.out.println("Before trimToSize : " + str.capacity());

        str.trimToSize(); // reduces extra size. Provide actual size of the string.
        System.out.println("After trimToSize : " + str.capacity());
        System.out.print(str + ", ");
        System.out.println("Length : " + str.length() + "\n");

        str.replace(5, 11, "Hasan");
        System.out.print("After replacing : " + str + ", ");
        System.out.println("Length : " + str.length() + "\n");

        str.reverse();
        System.out.println("After reversing : " + str + "\n");


        // ######################################################################
        StringBuilder str1 = new StringBuilder();

        str1.append("\nHello Java World!");
        str1.append("\nHello Spring World!");
        str1.insert(17, "\nInserted at middle");
        str1.appendCodePoint(44); // ","
        str1.appendCodePoint(72);
        str1.appendCodePoint(65);
        str1.appendCodePoint(83);
        str1.appendCodePoint(65);
        str1.appendCodePoint(78);

        System.out.println(str1 + "\n");

        str1.delete(17, 30);
        System.out.println(str1 + "\n");

        str1.deleteCharAt(17);
        System.out.println(str1 + "\n");

        // TODO: Repeat() for both string and stringBuilder
        System.out.println("Allah-u-Akbar ".repeat(10));

        StringBuilder str2 = new StringBuilder();
        str2.append("Allah-u-Akbar ".repeat(10));
        System.out.println(str2.toString());

    }
}
