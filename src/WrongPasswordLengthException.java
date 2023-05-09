import java.io.IOException;


public class WrongPasswordLengthException extends IOException {
    public WrongPasswordLengthException() {
        super();
    }

    public WrongPasswordLengthException(String message) {
        super(message);
    }

    public WrongPasswordLengthException(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordLengthException(Throwable t) {
        super(t);
    }
}
