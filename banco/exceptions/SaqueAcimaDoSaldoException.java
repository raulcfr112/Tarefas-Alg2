package banco.exceptions;

public class SaqueAcimaDoSaldoException extends Exception{
    public SaqueAcimaDoSaldoException() {
    }

    public SaqueAcimaDoSaldoException(String message) {
        super(message);
    }
}
