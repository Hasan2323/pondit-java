/*
* 1. Environment variable, path, JAVA_HOME
* 2. how to create Environment variable (temporary). It will vanish after closing the terminal if you create a temporary EV.
* 3. JDK path is stored in an EV called JAVA_HOME
* 4. args. this just a name of array. It can be changed. You can write saimon instead of args.
* 5. System.out.println(args[0]); it doesn't produce error in compile time but it will produce ArrayIndexOutOfBoundException in runtime.
* to solve this you have to pass a argument while running. ex: java PonditDayEight hello or "hello".
* 6. if you add/multiply two byte, it will be an integer. ex: byte +/* bye = int
* and, short +/* short = int and int +/* int = int. here / means or.
* so if anyone wants to add/multiply 2 byte/short type values, then he needs to write return type int or higher than int.
* */
public class PonditDayEight {
    public static void main(String[] saimon) {
        int num1 = 999999999;
        int num2 = 999999999;
        byte b1 = 9;
        byte b2 = 4;
        byte b3 = (byte) (b1 * b2);
        long re = (long) num1 * num2;
        long num3 = num1 * num2;
        System.out.println(re);
    }
}
