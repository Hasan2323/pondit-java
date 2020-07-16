/*
* Local variable and instance variable.
* String isn't a keyword. It's a class.
* default value of instance variables
* in boolean, you have to assign true or false. not 0 or 1.
* you can't access non-static variable from a static method.
* Array fixed length
* MultiDimension array
* mutable vs immutable
* basic diff between C n Java.
* datatype details
* Array details
* Primitive data types - includes byte, short, int, long, float, double, boolean and char = total 8 ta
*     -> Primitive data types are the core feature of Java
* Non-primitive data types - such as String, Arrays and Classes.
* */
public class PonditDaySeven {

    // These are instance variable. It does have default value.
    static byte num1;
    short num2;
    static int num3;
    static float num4;
    static double num5;
    static char chr;
    static String msg;
    static boolean completed;

    public static void main(String[] args) {

        // These are Local variable. It doesn't have default value. You must have to assign value after declaration.
        boolean isCompleted = true;
        boolean isTested = 1; // wrong. Either true or false. Neither 0 nor 1.

        int num;
        String String = "Hello World";  // Here String is used as a variable. Bcoz it's a class not keyword.
        // String int = "int is a keyword. So it can't be variableName.";
        // Keyword can't be a variable.


        // print local variable.
        System.out.println(isCompleted);
        System.out.println(num); //error
        System.out.println(String);

        // print instance variable.
        // you can't access non-static variable from a static method.
        System.out.println("byte default value "+num1);
        System.out.println("short default value "+num2); // you can't access non-static variable from a static method.
        System.out.println("int default value "+num3);
        System.out.println("float default value "+num4);
        System.out.println("double default value "+num5);
        System.out.println("char default value "+chr);
        System.out.println("String default value "+msg);
        System.out.println("boolean default value "+completed);


        //Array
        String[] days = new String[3]; // index 0,1,2 = 3 ta
        days[0] = "Friday";
        System.out.println(days[1]); // print null
        days[3] = "Tuesday"; // error

        String[] months = {"Janu", "Feb", "Mar", "May"};
        System.out.println(months[1]); // print Feb
        months[3] = "April";
        System.out.println(months[3]); // print April
        System.out.println(months[4]); //Error

        /*
         * days[3] and months[4] are showing Error. Array is Fixed Length type.
         * months array automatically creates 4 space in memory.(index 0,1,2,3)
         * so that months[4] is showing index out of bound error.
         * */

        int[][][] numbers = {{{13,16}, {14,15}, {45,46}}, {{15,67,89},{55,55,77},{90,55,98}}};
        System.out.println(numbers[1][1][2]);

        int num = 09; // why it's showing "integer number too large"


        // Java is written in C language.
        // Difference between C and Java :
        /* C is a compiled language. eta compile hoye native code hoi mane direct machine language a porinoto hoi. Machine sorasori read korte pare.
            but java is interpreted language. the code is first transformed into "byte code". this byte code is then executed by JVM.
             mane eta compile hoye first a "byte code" a porinoto hoi (ekta .class file create hoi). direct ML a porinoto hoina.
            then java'r JVM oi "byte code" k ML a convert kore.

            so that C is faster than Java.
         */

        /*
        * mutable or immutable (spelling not sure) [in video 2:45:40]
        * String is Immutable. "Immutable string" means it doesn't replace/override value in memory. It creates new space for it in memory. For ex,
        * String nam = "Saimon";
        * nam = "Hasan";
        * sout(nam); print Hasan
        * here in next assign into nam variable, it doesn't actually replace previous num variable in memory.
        * it creates a new space in memory for nam = "hasan".
        * Later, when Garbage collector works, it collects as garbage those unused variable like nam = "saimon".
        *
        *
        * Int is mutable. "Mutable int" does the reverse. It override/replace value in memory.
        * */
    }
}
