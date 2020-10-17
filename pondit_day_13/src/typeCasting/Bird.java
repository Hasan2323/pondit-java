package typeCasting;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/16/20 10:37 PM
 */

public class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("kuhu kuhu");
    }

    @Override
    public void canFly() {
        System.out.println("Bird can Fly.");
    }
}
