package banco.exceptions;

public class DepositoComValorNegativoException extends Exception {
    public DepositoComValorNegativoException() {
    }

    public DepositoComValorNegativoException(String message) {
        super(message);
    }
}
