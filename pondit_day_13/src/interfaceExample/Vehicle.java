package interfaceExample;

/*
* 1. all methods in this interface are automatically declared as "public abstract".
* Ex: 1. public abstract void play(); no need to write like this. you can simply write
*        void play();
* 2. You can't use "protected" modifier before any variable and method name in interface.
* 3. You can only add 'private' modifier before method name but for this, you have to add method body.
*    You can't add 'private' modifier before Variable name.
*
* NEW FEATURE in interface after Java 8
* 1. you can add default method with 'default' keyword.
*    and j class ai interface k implement korbe okhane ei default methods override kora jai abar na korle o kono error
*    show korbe na.
* 2. You can add static method. j class ai interface k implement korbe okhane ei static method auto override hobe na.
*
*    but you have to add method body for both methods(1,2 no) within this interface. because it's not abstract.
*
* 3. you can add constant (final) variable and other variable in interface.
* */

// TODO: For details explanation- https://www.baeldung.com/java-static-default-methods

public interface Vehicle {
    public final static double PI = 3.1416;
    String name = "hasan";

    String getBrand();

    String speedUp();

    String slowDown();

    private void testPrivateMethod() {
        System.out.println("Hello " + name + " from interface private method");
        System.out.println("Value of PI " + PI);
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}

interface Alarm {
    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}

class Car implements Vehicle, Alarm {

    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }

    // eta override na korle o problem nai jodi shudu ekta interface a thakto.
    // jehetu ekhane implements kora 2 interface a e ai method gula ache tai conflict khasche j konta k nibe r konta k nibe na.
    // tai ekhane must override korte hobe.
    @Override
    public String turnAlarmOn() {
        return Vehicle.super.turnAlarmOn();
        //return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Alarm.super.turnAlarmOn();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(Vehicle.name); // I don't know how!!! This name isn't static at all.
        System.out.println("Horse power: " + Vehicle.getHorsePower(2500, 480));

        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        /*
            For these two methods, the code simply won't compile, as there's a conflict caused by multiple interface inheritance.
            The Car class would inherit both sets of default methods. Which ones should be called then?
            To solve this ambiguity, we must explicitly provide an implementation for the methods: see line (88,94)

        */
    }

    // Please notice how the default methods turnAlarmOn() and turnAlarmOff() from our Vehicle
    // interface are automatically available in the Car class.

}
