package InterfaceExtends;

// Interface interface k extends kore (not implements). but ai khetre parent interface er method gula override kora lage na.
// It's different from normal extend that class does.

// 'Class' 'Interface' k implements kore. tokhon oi interface and oi interface j interface k extends korche sob interface
// er method gula k oi implemented class a override korte hobe.

public interface Flyable {
    void canFly();
}

// Java doesn't support Multiple inheritance. But an Interface extends multiple interface.
interface Bird extends Flyable, EggGiven {
    void canEat();
}

class Parrot implements Bird {

    @Override
    public void canEat() {

    }

    @Override
    public void canHatch() {

    }

    @Override
    public void canFly() {

    }
}

class Duck implements EggGiven {

    @Override
    public void canHatch() {
        System.out.println("From EggGiven impl");
    }
}
