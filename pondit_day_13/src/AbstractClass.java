/*
* 1. any class that extends abstract class needs to implement its methods.
*    but if extended class is also a abstract class then no need to implement its methods.
*
* */

public abstract class AbstractClass {

    public abstract void canFly();

    public void eat() {
        System.out.println("Hello from non abstract method");
    }
}

abstract class ExtendedClassOne extends AbstractClass {
    public abstract void canSing();
}


// This class extends ExtendedClassOne. But it must implement both ExtendedClassOne and AbstractClass's abstract method
// as it's parent ExtendedClassOne also extends AbstractClass.
class ExtendedClassTwo extends ExtendedClassOne {

    @Override
    public void canSing() {

    }

    // Will show error if I don't override this method inside this class.
    @Override
    public void canFly() {

    }

}
