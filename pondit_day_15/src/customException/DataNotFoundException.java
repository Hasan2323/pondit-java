package customException;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/1/20 11:58 PM
 */

public class DataNotFoundException extends Exception {

    public DataNotFoundException() {
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
