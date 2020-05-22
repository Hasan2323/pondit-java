public class DataType {

    public static void main(String[] args) {

        byte num = 127; // [8 bit] range: -128 to 127 (-2^7 to 2^7-1). That means 2^8=256. -128 theke 127 porjonto total 256 ta.

        short num1 = 32767; // [16 bit] range: -32,768 to 32,767 (-2^15 to 2^15-1)

        int num3 = 2147483647; // [32 bit] range: -2,14,74,83,648 to 2,14,74,83,647 (-2^31 to 2^31-1)

        long num4 = 9223372036854775807L; // [64 bit] range: from -9223372036854775808 to 9223372036854775807. (-2^63 to 2^63-1)
        // Note that you should end the value with an "L":

        String str = "this is a string";
        // String objects are immutable, which means that once created, their values cannot be changed.



    }

}
