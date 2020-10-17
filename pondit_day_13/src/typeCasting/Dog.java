package typeCasting;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/16/20 10:39 PM
 */

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Ghew Ghew");
    }

    @Override
    public void canFly() {
        System.out.println("Dog can't fly.");
    }

    public String tailLength() {
        return "12 inch";
    }
}
