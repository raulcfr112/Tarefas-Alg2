package banco.exceptions;

public class CPFInvalidoException extends Exception{

    public CPFInvalidoException() {
    }

    public CPFInvalidoException(String message) {
        super(message);
    }
}
