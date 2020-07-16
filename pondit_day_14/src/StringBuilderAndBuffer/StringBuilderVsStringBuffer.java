package StringBuilderAndBuffer;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/17/20 12:05 AM
 */

// link:  https://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

        long startTimeTwo = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTimeTwo) + "ms");

//        long startTime = System.currentTimeMillis();
//        StringBuffer sb = new StringBuffer("Java");
//        for (int i = 0; i < 100000; i++) {
//            sb.append("Tpoint");
//        }
//        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
