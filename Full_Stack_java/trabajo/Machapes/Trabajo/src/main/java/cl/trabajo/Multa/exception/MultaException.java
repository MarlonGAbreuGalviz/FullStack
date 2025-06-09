package cl.trabajo.Multa.exception;

public class MultaException extends RuntimeException{
    

    public MultaException(String message) {
        super(message);
    }

    // Constructor que recibe mensaje y causa (otra excepción)
    public MultaException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor que recibe solo causa
    public MultaException(Throwable cause) {
        super(cause);
    }
}
