import java.io.IOException;

public class WrongPasswordSymbolException extends IOException {
    public WrongPasswordSymbolException() {
        super();
    }

    public WrongPasswordSymbolException(String message) {
        super(message);
    }

    public WrongPasswordSymbolException(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordSymbolException(Throwable t) {
        super(t);
    }
}