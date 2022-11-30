package banco.exceptions;

public class CPFExistenteException extends Exception{

    public CPFExistenteException() {
    }

    public CPFExistenteException(String message) {
        super(message);
    }
}
