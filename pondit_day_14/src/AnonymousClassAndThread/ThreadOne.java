package AnonymousClassAndThread;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/15/20 9:01 PM
 */

public class ThreadOne implements Runnable {

    @Override
    public void run() {
        System.out.println("This is from One.");
    }
}
