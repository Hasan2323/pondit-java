// if you add/multiply two byte, it will be an integer. ex: byte +/* byte = int
// and, short +/* short = int and int +/* int = int. here / means or.
// so if anyone wants to add/multiply 2 byte/short type values, then he needs to write return type int or higher than int.

public class DataType {

    public static void main(String[] args) {

        byte num = 127; // [8 bit or 1 byte] range: -128 to 127 (-2^7 to 2^7 - 1). That means 2^8=256. -128 theke 127 porjonto total 256 ta.

        short num1 = 32767; // [16 bit or 2 bytes] range: -32,768 to 32,767 (-2^15 to 2^15 -1)

        int num3 = 2147483647; // [32 bit or 4 bytes] range: -2,14,74,83,648 to 2,14,74,83,647 (-2^31 to 2^31 - 1)

        long num4 = 9223372036854775807L; // [64 bit or 8 bytes] range: from -9223372036854775808 to 9223372036854775807. (-2^63 to 2^63 - 1)
        // Note that you should end the value with an "L":

        String str = "this is a string";
        // String objects are immutable, which means that once created, their values cannot be changed.

        int num5 = 999999999;
        int num6 = 999999999;
        byte b1 = 9;
        byte b2 = 4;
        byte b3 = b1 * b2; // error
        long re = num5 * num6;
        // one of the disadvantage of Java, you can't find out many errors in compile time.
        // for example, ekhane long re = num5 * num6; ai line kono error dekhaschena in compile time.
        // but If I run, this won't give me the proper answer. Big problem.
        System.out.println(re);

    }

}
