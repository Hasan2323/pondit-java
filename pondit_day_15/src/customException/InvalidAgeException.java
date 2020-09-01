package customException;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/1/20 11:40 PM
 */

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgeException(Throwable cause) {
        super(cause);
    }

}
