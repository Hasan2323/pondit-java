/*
 * 1. If you put final on class, then no one can able to extends it.
 * 2. If you put final on method, then no child of parentClass can able to override that method.
 * 3. If you put final on variable, that variable will be called "constant variable" and
 *    all word of that variable has to be UPPERCASE, later no one can able to change the value of that variable.
 *    one more thing, it's better to use static on constant variable.
 *
 * */

final public class FinalKeyword {
    static final float PI = 3.1416f;

    final public void parentMethod() {
        System.out.println("Final parent method! Can't override");
    }
}

class ChildClss extends FinalKeyword { // showing error. you can't extends final parent class.

    @Override
    public void parentMethod() { //showing error. you can't override final method
        super.parentMethod();
    }

    public static void main(String[] args) {
        FinalKeyword.PI = 8.44f; // showing error. you can't change the final variable's value.


    }
}