package exception;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/31/20 1:04 AM
 */

public class UncheckedOrRuntimeException {
    public static void main(String[] args) {
        UncheckedOrRuntimeException uncheckExp = new UncheckedOrRuntimeException();
        uncheckExp.strLength(null);
        System.out.println("Out of Error");
        arrayValueCheck();
    }


    /*
    * here, NullPointerException has been occurred in str.length() in RUNTIME. Not in compile time.
    * */
    public void strLength(String str) {
//            System.out.println(str.length());

    // Solution: for above line, you have to check null.
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String can't be null");
        }
    }


    private static void arrayValueCheck() {
        String[] names = new String[] {"Muhammad", "Abid", "Hasan"};

        /*
        * Another Unchecked Exception. This won't be caught in Compile time. This is logical error. this will be caught
        * in RUNTIME. this is ArrayIndexOutOfBoundsException.
        * */
        String nickName = names[3];
        System.out.println(nickName);
    }


}
