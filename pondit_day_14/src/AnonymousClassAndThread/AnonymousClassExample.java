package AnonymousClassAndThread;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/15/20 8:34 PM
 */

public class AnonymousClassExample {
    public static void main(String[] args) {

        // If you code like this (one and Two). You have to create separate class(ThreadOne and ThreadTwo class) for each.
        Thread threadOne = new Thread(new ThreadOne());
        threadOne.start();

        Thread threadTwo = new Thread(new ThreadTwo());
        threadTwo.start();

        // TODO: If you use anonymous class like this. You don't have to create any class. just pass new Runnable() class.
        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from thread three");
            }
        });
        threadThree.start();

        Thread threadFour = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from thread four");
            }
        });
        threadFour.start();

        //Using Lamda Expression
        Thread threadFive = new Thread(() -> {
            System.out.println("This is from thread five using Lamda.");
        });
        threadFive.start();
    }
}
