package AnonymousClassAndThread;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/15/20 9:02 PM
 */

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("This is from two");
    }
}
