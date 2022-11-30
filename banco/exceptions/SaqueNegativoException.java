package banco.exceptions;

public class SaqueNegativoException extends Exception{
    public SaqueNegativoException() {
    }

    public SaqueNegativoException(String message) {
        super(message);
    }
}
