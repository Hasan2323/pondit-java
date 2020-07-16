package StringBuilderAndBuffer;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/16/20 11:42 PM
 */

public class DiffBetweenStringVsStringBuilderOrBuffer {
    public static class ConcatTest {
        public static void concatWithString() {
            String t = "Java";
            for (int i = 0; i < 10000; i++) {
                t = t + "Tpoint";
            }
        }

        public static void concatWithStringBuffer() {
            //StringBuilder sb = new StringBuilder("Java");
            StringBuffer sb = new StringBuffer("Java");
            for (int i = 0; i < 10000; i++) {
                sb.append("Tpoint");
            }
        }

        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            concatWithString();
            System.out.println("Time taken by Concatenating with String: " + (System.currentTimeMillis() - startTime) + "ms");

            startTime = System.currentTimeMillis();
            concatWithStringBuffer();
            System.out.println("Time taken by Concatenating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        }
    }
}
