package packageOne;/*
* 1. Access Modifier 4 ta. Public, Private, Protected, Default
* 2. jokhon kono class,method,variable er aage public/protected/private thake na, otai default
* 3. You can't access default modifier from other package. can access only within your package.
* 4. Constructor returns Object by default. No need to put return
*
* */

// can't extends this ParentClass.
// because this ParentClass has "default" modifier and you can't access DM from outside of DM's package.
// put your cursor on ParentClass here. You will get a details POP-up.
import packageTwo.ParentClass;

public class PonditDayTen extends ParentClass {
    // instance variable
    private int age;

    // class level variable
    public static long salary;

    public PonditDayTen(String name, int age) {
        // this name trying to access name variable from parent class. but can't able to access
        // because this name has "default" modifier and you can't access DM from outside of DM's package.
        this.name = name;
        this.age = age;
    }
}

// TODO: Every class by default extends Object class.
// TODO: So Object class is a "default parent" of any class.
// TODO: you don't need to write "extends Object".
// to know details, see InstanceOfWhichClassAndSuperMethod and CopyObject Class.

class TestClass /* extends Object */ {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
