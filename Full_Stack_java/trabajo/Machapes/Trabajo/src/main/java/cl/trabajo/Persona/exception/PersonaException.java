package cl.trabajo.Persona.exception;

public class PersonaException extends RuntimeException{
    

    public PersonaException(String message) {
        super(message);
    }

    // Constructor que recibe mensaje y causa (otra excepción)
    public PersonaException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor que recibe solo causa
    public PersonaException(Throwable cause) {
        super(cause);
    }
}
