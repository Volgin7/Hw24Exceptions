import java.io.IOException;


public class WrongLoginLengthException extends IOException {
    public WrongLoginLengthException() {
        super();
    }

    public WrongLoginLengthException(String message) {
        super(message);
    }

    public WrongLoginLengthException(String message, Throwable t) {
        super(message, t);
    }

    public WrongLoginLengthException(Throwable t) {
        super(t);
    }
}