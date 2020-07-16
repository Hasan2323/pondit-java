package Interger;

// For every primitive types, there is an Object type variable. Ex:
//   int -> Integer, double -> Double, boolean -> Boolean, short -> Short, char -> Character etc etc.
// These object type variables extends 'Number' abstract class.
// what is Auto-Boxing and Auto-unboxing? see below

public class NumberPractise {
    public static void main(String[] args) {
        int intVal = 4;
        Integer integerVal = 5;

        System.out.println(intVal);
        System.out.println(integerVal);

        double doubleVal = 4.4;
        Double doubleVal1 = 4.5;

        System.out.println(doubleVal);
        System.out.println(doubleVal1);

        NumberPractise numberPractise = new NumberPractise();
        numberPractise.calculate1(intVal);
        numberPractise.calculate2(integerVal);

        numberPractise.calculate(integerVal);
        numberPractise.calculate(doubleVal);


    }

    // Ekhane Receive korteche Integer Object type data. But pathasche primitive type int value. How can it be possible?
    // yes possible. Java automatically converts this int To Integer. (for same type means int to Integer, double to Double)
    // TODO: This is called "Auto-Boxing"
    void calculate1(Integer num) {
        System.out.println("In calculate method: " + num);
    }


    /* Ekhane Receive korteche primitive type int value. But pathasche Integer Object type data. How can it be possible?
     * yes possible. Java automatically converts this Integer to int. (for same type means Integer to int, Double to double)
     * TODO: This is called "Auto-unboxing"
     */
    void calculate2(int num) {
        System.out.println("In calculate2 method: " + num);
    }

    /*
     * In those above methods, it is fixed that what you could send. Means you could only send int/Integer type value.
     * you couldn't send any Double, Float type variable. because those methods only receives int/Integer type value.
     *
     * But If you want to send Any number like int, double, float and method can receive whatever you sent. Then you have
     * receive "Number" as method parameter. Number is a parent of all Object type number. (Double, Integer all are child of Number. they extends Number.)
     * */
    private void calculate(Number num) {
        System.out.println("Any number type: " + num);
        // there are lot of method. You can convert any Type to another. like double to int and vice versa
        System.out.println(num.intValue());
        System.out.println(num.doubleValue());
    }
}
