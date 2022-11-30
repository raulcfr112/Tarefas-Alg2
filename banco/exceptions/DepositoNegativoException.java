package banco.exceptions;

public class DepositoNegativoException extends Exception{
    public DepositoNegativoException() {
    }

    public DepositoNegativoException(String message) {
        super(message);
    }
}
